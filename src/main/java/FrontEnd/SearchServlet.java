package FrontEnd;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;


/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.getWriter().append("Served at: ").append(req.getContextPath());
		
		doPost(req, res);
		res.setContentType("text/html");
		String open=req.getParameter("browser");
		if("Html".equals(open)) 
		 {
			   RequestDispatcher dispatcher = req.getRequestDispatcher("Html.html");
			   dispatcher.forward(req, res);
			   } 
		else if ("Java".equals(open)) {
			   RequestDispatcher dispatcher = req.getRequestDispatcher("Java.html");
			   dispatcher.forward(req, res);
			   }
		else if ("Css".equals(open)) {
			   RequestDispatcher dispatcher = req.getRequestDispatcher("Html.html");
			   dispatcher.forward(req, res);
			   }
		else if ("Css".equals(open)) {
			   RequestDispatcher dispatcher = req.getRequestDispatcher("Html.html");
			   dispatcher.forward(req, res);
			   }
		

		
	}
}

