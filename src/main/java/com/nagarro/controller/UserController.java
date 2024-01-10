package com.nagarro.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.services.UserServices;

@Controller
public class UserController {
	
	
	@RequestMapping("/Login")
	public void login(HttpServletRequest request,HttpServletResponse response,@RequestParam("username") String username, @RequestParam("password") String password) throws IOException {
		
		UserServices userServices = new UserServices();
		
		int result = userServices.checkIfExistUser(username,password);
		
		if (result == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("Index");
		} else {
			response.sendRedirect("login.jsp");
		}
	}
	
	@RequestMapping("/Logout")
	public void logout(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("username", null);
		response.sendRedirect("login.jsp");

	}
}
