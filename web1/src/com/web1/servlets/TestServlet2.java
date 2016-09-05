package com.web1.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet2 extends HttpServlet {
	public void init(){}
	public void destory(){}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		
		//request.setCharacterEncoding("utf-8");
		//response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("psd");
		System.out.println("TestServlet2 被调用");
		
		HttpSession session = request.getSession();
		session.setAttribute("uname", uname);
		//跳转页面
		response.sendRedirect("s3");
		
		//RequestDispatcher rd = request.getRequestDispatcher("s3");
		//rd.forward(request, response);
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		doPost(request,response);
	}
	
}
