package com.bha;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	private static final String insert_query=("insert into EmployeeDetails(Username,phoneNumber,Email,DOB,Address,Gender,Password)values(?,?,?,?,?,?,?)");
			

    public RegisterServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String Username=request.getParameter("User_name");
		String phoneNumber=request.getParameter("Phone_number");
		String Email=request.getParameter("Email");
		String DOB=request.getParameter("dob");
		String Address=request.getParameter("address");
		String Gender=request.getParameter("gender");
		String Password=request.getParameter("Password");
		 
//		System.out.println("name:" +Username );
//		System.out.println("Phone number:" +phoneNumber );
//		System.out.println("E-mail:" +Email );
//		System.out.println("Password:" +Password );	
//		System.out.println("DOB:" +DOB );
//		System.out.println("Address:" +Address );
//		System.out.println("Gender:" +Gender );
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhavani", "root", "root");
			PreparedStatement ps=con.prepareStatement(insert_query);
			
			ps.setString(1, Username);
			ps.setString(2, phoneNumber);
			ps.setString(3, Email);
			ps.setString(4, DOB);
			ps.setString(5, Address);
			ps.setString(6, Gender);
			ps.setString(7, Password);
			
			int count=ps.executeUpdate();
			if(count==0) {
				pw.println("Data does not store in database");
			}else {
				pw.println("Data store in database");
			}
//			ResultSet rs=ps.executeQuery("select * from EmployeeDetails");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		pw.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
