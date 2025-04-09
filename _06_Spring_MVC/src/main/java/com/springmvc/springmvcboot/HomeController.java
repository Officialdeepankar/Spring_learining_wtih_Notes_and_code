package com.springmvc.springmvcboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Student;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	
	@Autowired
	StudentRepo db;
	/*
	 * HERE we will be using @model attriubte and it will work before any request mapping 
	 * 
	 */
	
	
	@ModelAttribute
	public void showMessage(Model m)
	{
		m.addAttribute("greet","sanju");
		
	}

	@RequestMapping("/")
	
	public String  Home()
	{
		return "index.jsp";
	}
	
	
//	@RequestMapping("/add")
//	
//	public String add()
//	{
//		return "add.jsp";
//	}
	
// --------------------------------------WITHOUT @REQUEST MAPPING---------------------------------	
//	@RequestMapping("addboth")
//	
//	public String addboth(HttpServletRequest req)
//	{
//		int num1=Integer.parseInt(req.getParameter("num1"));
//		int  num2=Integer.parseInt(req.getParameter("num2"));
//		
//		HttpSession session=req.getSession();
//		session.setAttribute("num3", num1+num2);
//		
//		
//		
//		return "result.jsp";
//		
//	}
	
	/* -------------------------------HTTP session-----------------------
	@RequestMapping("addboth")
	
	public String addboth(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session)
	{
		
		
		
		session.setAttribute("num3", i+j);
		
		
		
		return "result.jsp";
		
	}
	
	*/
	
	/*-----------------------------------------MODEL AND VIEW-----------------------------------------------------
@RequestMapping("addboth")

     * 1) Here we are going to use ModelAndView 
     * 2) we can pass view in ModelAndView constructor 
     * 3) . addobject();
	
	public ModelAndView addboth(@RequestParam("num1") int i, @RequestParam("num2") int j)
	{
		
		ModelAndView mv=new ModelAndView("result.jsp");
		
		mv.addObject("num3",i+j);

		return mv;
		
	}
	
	*/
	
	//----------------------------------- MODEL ----------------------------------------------------
//	@RequestMapping("addboth")
//	public String  addboth(@RequestParam("num1") int i, @RequestParam("num2") int j,Model m)
//	{
//		
//		int num3=i+j;
//		
//		m.addAttribute("num3",num3);
//
//		return "result.jsp";
//		
//	}
	
	
	
	/*-----------------------------------------@MODEL ATTRIBUTE------------------------------------------
	 * 1)CREATE  STUDENT MODEL IN Com.springmvc
	 * 2)Create a form which will take those values present in the student model. (keep "name" as present in student class".
	 * 
	 * 
	 */
	//---------------------------------------DOING WIHOUT MODEL ATTRIUBUTE-----------------------------------------
	
	@RequestMapping("StudentForm")
	
	public String Studentform()
	{
		return "StudentForm.jsp";
	}
	
	
	
	
	/*
	
    @RequestMapping("addStudent")
	public String  getStudentInfo(@RequestParam("id")int id,@RequestParam("name")String name,Model m)
	{
		// now in 'm" model i want to add Student object by newly creating it. 
    	
    	// step-1) Creating student object
    	Student s = new Student();
    	s.setId(id);
    	s.setName(name);
    	
    	// step-2) Adding this object to my model 'm'
    	
    	m.addAttribute("STUDENTINFO",s);
    	
    	return "ShowStudent.jsp";
	}
	
	*/
	
	/*
	
	// ------------------------------------------By using Model attribute------------------------
//	 @RequestMapping("addStudent")
//		public String  getStudentInfo(@ModelAttribute Student s,Model m)
//		{
//			// now in 'm" model i want to add Student object by newly creating it. 
//	    	
//	    	// step-1) Creating student object
//	    	
//	    	
//	    	// step-2) Adding this object to my model 'm'
//	    	
//	    	m.addAttribute("STUDENTINFO",s);
//	    	
//	    	return "ShowStudent.jsp";
//		}
	
	
	*/
	
	
	/*
	 ------------------------------------ Method-1) add student-----------------------------
	 
	 */
	
	@PostMapping("addStudent")
	  public String addStudent(@ModelAttribute Student s,Model m)
	  {
		Student stu= db.save(s);
		
		if (stu!=null && stu.getId()!=0)
		{
			
			m.addAttribute("msg",s);
		}else
		{
			m.addAttribute("msg","falied to save student ");
		}
		 
		 return "ShowStudent.jsp";
	  }
	
	
	//-----------------------------------------Method-2) Delete student--------------------------------
	
	@PostMapping("deleteStudent")
	
	  public String   deleteStudent(@RequestParam("idS") int id, Model m)
	  
	  {
		 db.deleteById(id);
		
		 if(!db.existsById(id))
		 {
			 m.addAttribute("msg","Successfully deleted ");
		 }else
		 {
			 m.addAttribute("msg","Not deleted ");
		 }
		return "ShowStudent.jsp";
	  }
	
	// -------------------------------------Method-3) show all student----------------------------------
     @GetMapping("GetAllStudent")
	public String ShowAllStudent(Model m)
	{
		List<Student>st=db.findAll();
		
		m.addAttribute("msg",st);
		
		return "ShowStudent.jsp";
	}
	
	//--------------------------------------update student---------------------------------

     @PostMapping("updateStudent")
     public String updateStudent(@ModelAttribute Student s, Model m) {
         if (db.existsById(s.getId())) {
             db.save(s); // update because ID exists
             m.addAttribute("msg", "Student updated successfully!");
         } else {
             m.addAttribute("msg", "Student not found. Update failed.");
         }
         return "ShowStudent.jsp";
     }
     
     //------------------------------------------------------ Query JSl------------------------------
     
  // what if i dont want to use the primary key for extracting infromation out of mysql database 
 	/*
 	 * What about if i want to use other parameter;
 	 */
     
     @GetMapping("SimilarStudent")
  public String GetSimilarStudents(@RequestParam("name")String name,Model m)
	  {
    	List<Student>ls= db.findByNameOrderByName(name);
    	
    	m.addAttribute("msg",ls);
    	
    	return "ShowStudent.jsp";
	  }
     
     
     
     //-----------------------------------------------Query DSL---------------------------------------
     
  
    
}
