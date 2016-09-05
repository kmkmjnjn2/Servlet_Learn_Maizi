package com.web1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class TestServlet1 extends HttpServlet {
	
	public void init(){
		System.out.println("init()����������");
	}
	public void destory(){
		System.out.println("destory()����������");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
		System.out.println("doGet����������");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String usname = request.getParameter("username");
		System.out.println(usname);
		PrintWriter pw = response.getWriter();
		pw.print("Hello"+usname+"!!!!");
		pw.close();
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException{
		System.out.println("doPost()����������");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String usname = request.getParameter("username");
		String psd = request.getParameter("psd");
		
		PrintWriter pw = response.getWriter();
		pw.print("doPost(): Hello"+usname+"  psd:"+psd);
		pw.close();
	}
}