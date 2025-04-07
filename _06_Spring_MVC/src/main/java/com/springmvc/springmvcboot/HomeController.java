package com.springmvc.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	
	public String  Home()
	{
		return "index.jsp";
	}
	
	
	@RequestMapping("/add")
	
	public String add()
	{
		return "add.jsp";
	}
	
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
	
	
	@RequestMapping("addboth")
	
	public String addboth(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session)
	{
		
		
		
		session.setAttribute("num3", i+j);
		
		
		
		return "result.jsp";
		
	}
	
}
