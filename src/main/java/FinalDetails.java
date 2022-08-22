

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FinalDetails
 */
public class FinalDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalDetails() {
        super();
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
		PrintWriter pw=response.getWriter();
		String pname=request.getParameter("pname");
		String page=request.getParameter("page");
		String pgender=request.getParameter("pgender");
		
		HttpSession session=request.getSession();
		session.setAttribute("username",pname);
		session.setAttribute("userage",page);
		session.setAttribute("usergender",pgender);

		String sr=(String)session.getAttribute("source");
		String dest=(String)session.getAttribute("destination");
		
		if(sr.equals("India") && dest.equals("USA")) {
			response.sendRedirect("Payment1");
	    }
		else if(sr.equals("Australia") && dest.equals("Canada")) {
			response.sendRedirect("Payment2");
		}
		else if(sr.equals("USA") && dest.equals("London")) {
			response.sendRedirect("Payment3");
		}
		else if(sr.equals("India") && dest.equals("Canada")) {
			response.sendRedirect("Payment4");
		}
		else if(sr.equals("Japan") && dest.equals("China")) {
			response.sendRedirect("Payment5");
		}
		else {
			pw.print("Wrong");
		}
		
		//doGet(request,response);
	}

}
