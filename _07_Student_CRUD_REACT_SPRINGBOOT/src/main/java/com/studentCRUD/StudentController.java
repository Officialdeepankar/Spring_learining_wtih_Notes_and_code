package com.studentCRUD;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentCRUD.Model.Student;
import com.studentCRUD.Repo.StudentRepo;

@RestController
public class StudentController {

	
	@Autowired
	StudentRepo db;
	
	//---------------------------------------CreateStudent-Api------------------------------------
     
	@PostMapping("/api/Student/Create-Student")
	@ResponseBody    // to send data in HTTP format
	public Student  CreateStudent(@RequestBody Student s)
	{
		
		Student stu=db.save(s); 
		return stu;
	}
	
	/*What i learned by creating CreateStudent method
	 * @PostMapping-to post data
	 * @ResponseBody - to send data in http format 
	 * 
	 * 
	 * @RequestBody - “Whatever this method returns — send it directly in the HTTP response body
	 *  as JSON (or other format), instead of trying to open an HTML or JSP page.”


	 */
	
	
	
	//---------------------------------------GetAllStudent-Api------------------------------------
	
	@GetMapping("/api/Student/GetAll-Student")
	@ResponseBody
	public List<Student> GetAllStudent()
	{
	    List<Student> s=db.findAll();
		
		return s;
	}
	
	//---------------------------------------GetStudentById-Api------------------------------------
	
    @GetMapping("/api/Student/GetStudentBy-Id/{id}")
    @ResponseBody
    public Student GetStudentById(@PathVariable Long id)
    {
    	    Student st= db.findById(id).orElse(new Student(0,"NameDoNotExists","CourseDoNotExists","EmailDoNotExists"));
    	    return st;
    }
    
  //---------------------------------------UpdateExistingStudentById-Api------------------------------------
    
    
    @PutMapping("/api/Student/updateExistingStudentBy-id/{id}")
    @ResponseBody
    public Student UpdateExistingStudentById(@PathVariable Long id,@RequestBody Student s)
    {
    	System.out.println("Update API Called for ID: " + id);
    	
    	
    	  Optional<Student>optional  =db.findById(id);
    	  
    	  if (optional.isPresent())
    	  {
    		  // something exists
    		  // this logic is written so that no new entry should be made and only existing entry gets upadated
    		  	Student existingStudent=optional.get();
    		  	existingStudent.setName(s.getName());
    		  	existingStudent.setEmail(s.getEmail());
    		  	existingStudent.setCourse(s.getCourse());
    		  	db.save(existingStudent);
    		  	return existingStudent;
    	  }else {
    		  return new Student(0, "NameDoNotExists", "CourseDoNotExists", "EmailDoNotExists");
    	  }
    
    }
    
    //------------------------------------------Delete student by id-------------------------------
    
   @DeleteMapping("/api/Student/deleteExistingStudentBy-id/{id}")
   public Student DeleteStudentById(@PathVariable Long id)
   {
	 // check if student exists
	   System.out.println("Delete API Called for ID: " + id);
	   
	   Optional<Student> optionalStudent = db.findById(id);
	   if (optionalStudent.isPresent()) {
	       db.deleteById(id);
	       return optionalStudent.get();  // return deleted student info
	   } else {
	       // Return a default student or throw a custom 404 error
	       return new Student(0, "NameDoNotExists", "CourseDoNotExists", "EmailDoNotExists");
	   }

   }
}
