package com.web1.servlets;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCounterListener implements HttpSessionListener,HttpSessionAttributeListener{
	private int count = 0;
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		count++;
		System.out.println("有新用户加入，当前的用户人数是："+count);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		count--;
		if(count<0){count=0;}
		System.out.println("有用户退出，当前用户的人数是："+count);
	}

	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Session中有属性添加");
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
