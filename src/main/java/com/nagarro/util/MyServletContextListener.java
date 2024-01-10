package com.nagarro.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


import com.nagarro.dao.UserDao;
import com.nagarro.model.User;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// Notification that the servlet context is about to be shut down.
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		User user = new User();

		user.setUsername("admin");
		user.setPassword("root1");

		UserDao us = new UserDao();
		us.saveUser(user);

	}

}