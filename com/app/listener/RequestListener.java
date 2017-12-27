package com.app.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestListener
 *
 */
@WebListener
public class RequestListener implements ServletRequestListener {

	/**
	* Default constructor. 
	*/
	public RequestListener() {
	// TODO Auto-generated constructor stub
	}

	/**
	* @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
	*/
	public void requestDestroyed(ServletRequestEvent sre) { 
	System.out.println("Request Destroyed");
	}

	/**
	* @see ServletRequestListener#requestInitialized(ServletRequestEvent)
	*/
	public void requestInitialized(ServletRequestEvent sre) { 
	System.out.println("Request Initialized");
	}

	}
