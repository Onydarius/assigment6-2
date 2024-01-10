package com.nagarro.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.model.Book;


@Controller
public class LibraryController {

	@RequestMapping("/Index")
	public void getAll(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		response.sendRedirect("index.jsp");
	}
	
	@RequestMapping("/Edit")
	public void edit(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		request.setAttribute("mode", "Edit");

		
		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
		
	
		response.sendRedirect("edit.jsp");
	}
	
	@RequestMapping("/saveBook")
	public void SaveBook(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
	
		
	
		response.sendRedirect("index.jsp");
	}
	
	
	@RequestMapping("/New")
	public void save(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		Book book = new Book();
		
		book.setAdded(LocalDate.now());
		
		String date = book.getAdded().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
		
		request.setAttribute("mode", "Save");
		request.setAttribute("book", book);
		request.setAttribute("date", date);
		
		RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
		
		rd.forward(request, response);
		
	
		response.sendRedirect("save.jsp");
	}
	
	
}
