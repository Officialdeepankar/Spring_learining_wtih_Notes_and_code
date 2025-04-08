<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>STUDENT CRUD</title>
</head>
<body>
	<h1> STUDENT MANAGEMENT</h1>
	
	
<h2> ----------------------------------------------------------------------------------</h2>
   <h1>ADD STUDENT <h1>
    <form action="addStudent" method="post">
      <label> Enter id </label>
		<input type="text" name="id">   </input>
		
		<label> Enter name </label>
				<input type="text" name="name">   </input>		
		<button type="submit" > Submit </button>
		</form>
		
<h2> -----------------------------------------------------------------------------------</h2>	
		<h1>   DELETE STUDENT  </h1>
		
		<form action="deleteStudent" method="post">  
			
			<label>Enter id of the student to delete  </label>
			<input type="text" name="idS">   </input>
		    <button type="submit">SUBMIT </button>
		  </form>
		
<h2> -----------------------------------------------------------------------------------</h2>	
           <h1>   SHOW ALL STUDENTS REGISTERED </h1>

          <form action="GetAllStudent">  
			
			<label>Click to get all students info who are registerd till now! </label>
			
		    <button type="submit">SUBMIT </button>
		  </form>
		
<h2> ----------------------------------------------------------------------------------</h2>
		     <h1>Update STUDENT <h1>
		      <form action="updateStudent" method="post">
		        <label> Enter id </label>
		  		<input type="text" name="id">   </input>

				<label> Enter name </label>
						<input type="text" name="name">   </input>	
		  		<button type="submit" > Submit </button>
		  		</form>

		
</body>
</html>
