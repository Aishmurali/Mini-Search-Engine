package FrontEnd;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");  
        PrintWriter pw=res.getWriter();
	String fname = req.getParameter("FirstName");
  String lname = req.getParameter("LastName");
  String month = req.getParameter("b_month");
  String day = req.getParameter("b_day");
  String year = req.getParameter("b_year");
  String mobile = req.getParameter("MobileNumber");
  String email = req.getParameter("EMail");
  String uname = req.getParameter("UserName");
  String passwrd = req.getParameter("Password");
  String birthdate=month+"/"+day+"/"+year;


try {
	Class.forName("com.mysql.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/searchenginedb","root","Aishu@416");
    PreparedStatement ps=con.prepareStatement("insert into logintbl values(?,?,?,?)");  
	
      
    ps.setString(1,fname);  
    ps.setString(2,lname);  
    ps.setString(3,birthdate);  
    ps.setString(4,mobile);  
    ps.setString(5,email);  
    ps.setString(6,uname);  
    ps.setString(7,passwrd);  
    
    int i=ps.executeUpdate();     
    
    
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.getWriter().append("Served at: ").append(req.getContextPath());
		doPost(req, res);
		RequestDispatcher rd=req.getRequestDispatcher("/Login.html");
        rd.forward(req, res);
		
	}

}

	
