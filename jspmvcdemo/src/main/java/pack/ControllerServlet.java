package pack;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspmvcdemo.LoginBean;

public class ControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		//database connection setup
		Connection connection=DatabaseConnection.getConnection();
		//chack if the user exits in database
		String query="SELECT*FROM users_validate WHERE username=? AND password=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				//user credential are valid-proceed to success page
				LoginBean bean=new LoginBean();
				bean.setName(name);
				bean.setPassword(password);
				request.setAttribute("bean", bean);
				
				RequestDispatcher rd=request.getRequestDispatcher("login-sucess.jsp");
				rd.forward(request,response);
			}
			else {
				//user credential are invalid forwad to error page
				RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");
				rd.forward(request,response);
			}
		}
		catch(Exception e) {
			
		};
	}

}
