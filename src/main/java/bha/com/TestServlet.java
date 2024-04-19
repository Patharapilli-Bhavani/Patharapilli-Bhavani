package bha.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestServlet() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("To get Working");
//		response.getWriter().write("<html>\r\n"
//				+ "	<head align=\"center\">\r\n"
//				+ "		Services Working\r\n"
//				+ "	</head>\r\n"
//				+ "	<body>\r\n"
//				+ "		<h3>The answer is:1000</h3>\r\n"
//				+ "	</body>\r\n"
//				+ "</html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
		String a=request.getParameter("num1");
		String s=request.getParameter("op");
		String b=request.getParameter("num2");
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		char ch=s.charAt(0);
		int result;
		switch(ch) {
		
		case '+' : 
			result=x+y;
			response.getWriter().write("The answer is:" +result);
			break;
		
		case '-' : 
			result=x-y;
			response.getWriter().write("The answer is:" +result);
			break;
			
		case '*' : 
			result=x*y;
			response.getWriter().write("The answer is:" +result);
			break;
			
		case '%' : 
			result=x%y;
			response.getWriter().write("The answer is:" +result);
			break;
	}
	
		
//		response.getWriter().write("<html>\r\n"
//				+ "	<head>\r\n"
//				+ "		<p align=\"center\">Servlet working</p>\r\n"
//				+ "	</head>\r\n"
//				+ "	<body>\r\n"
//				+ "		<label>Answer is:</label>\r\n"
//				+ "		<input type=\"text\" placeholder=\"answer is......\"/>\r\n"
//				+ "	</body>\r\n"
//				+ "</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("To post Working");
		//doGet(request, response);
	}

}
