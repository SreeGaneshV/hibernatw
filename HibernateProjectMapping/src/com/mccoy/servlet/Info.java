package com.mccoy.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mccoy.mapping.hbdetails;

public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Info() {
        super();
       
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");	
		String name=request.getParameter("name");
		String email=request.getParameter("email");
	    String mobileno=request.getParameter("mobileno");
	    long no =Long.parseLong(mobileno);
	    String account=request.getParameter("account");
	    String bankname=request.getParameter("bankname");
	    
	    System.out.println("name...............");

	    hbdetails obj = new hbdetails();
		obj.saveUser(name, email, no, account,bankname);
			
			  RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			  rd.forward(request, response);
	
	}
}
