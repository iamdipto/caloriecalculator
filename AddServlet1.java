package com.calorie983count;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet1 extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
{
	int age=Integer.parseInt(req.getParameter("age1"));
			double weight=Double.parseDouble(req.getParameter("weight1"));
		double result=weight*30;
		PrintWriter out=res.getWriter();
		out.println("The daily calorie intake you need is"+result);
}
}

