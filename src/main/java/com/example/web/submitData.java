package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.model;

/**
 * Servlet implementation class submitData
 */
@WebServlet("/submitData")
public class submitData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public submitData() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userSubject = request.getParameter("userSubject");
		String userDesc = request.getParameter("userDesc");
		
		//print value//
		PrintWriter out = response.getWriter();
		out.println("<h5>"+userName+"<br>"+userEmail+"<br>"+userSubject+"<br>"+userDesc);
		//call submit process
//		model mod = new model();
//		mod.submit(userName, userEmail, userSubject, userDesc);
		
		doGet(request, response);
	}

}
