

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AvailFlights
 */
public class AvailFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AvailFlight() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String date=request.getParameter("date");
		String sr=request.getParameter("sr");
		String dest=request.getParameter("dest");
		String person=request.getParameter("person");
		
		HttpSession session=request.getSession();
		session.setAttribute("dates",date);
		session.setAttribute("source",sr);
		session.setAttribute("destination",dest);
		session.setAttribute("noperson",person);

		
		PrintWriter pw = response.getWriter();
		if(sr.equals("India") && dest.equals("USA")) {
			response.sendRedirect("searchresult.jsp");
	    }
		else if(sr.equals("Australia") && dest.equals("Canada")) {
			response.sendRedirect("searchresult1.jsp");
		}
		else if(sr.equals("USA") && dest.equals("London")) {
			response.sendRedirect("searchresult2.jsp");
		}
		else if(sr.equals("India") && dest.equals("Canada")) {
			response.sendRedirect("searchresult3.jsp");
		}
		else if(sr.equals("Japan") && dest.equals("China")) {
			response.sendRedirect("searchresult4.jsp");
		}
		else {
			pw.print("No Flight Available!!!");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
