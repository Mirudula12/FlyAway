

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Success
 */
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String no=request.getParameter("no");
		String cname=request.getParameter("cname");
		
		HttpSession session=request.getSession();
		String pname=(String)session.getAttribute("username");
		String page=(String)session.getAttribute("userage");
		//String pgender=(String)session.getAttribute("usergender");
		String date=(String)session.getAttribute("dates");
		String sr=(String)session.getAttribute("source");
		String dest=(String)session.getAttribute("destination");
		
		
		PrintWriter pw = response.getWriter();
		if(no.equals("457") && cname.equals("MIRUDULA")) {
			pw.print("<html>"
					+ "<body>" 
					+ "<h1>Payment Success</h1>"
					+ "<h2>Ticket Booked</h2>"
					+ "<h3>Ticket Details</h3>"
					+ "</body>"
					+ "</html>"
				);
			
			pw.print("<html>"
					+ "<body>" + 
					"\nPassenger Name :" + pname
			        + "<br>"
			        + "</body>"
					+ "</html>"
			        );
			pw.print("<html>"
					+ "<body>" + 
					"Passenger Age :" + page
			        + "<br>"
			        + "</body>"
					+ "</html>"
			        );
			pw.print("<html>"
					+ "<body>" + 
					"Passenger Source :" + sr
			        + "<br>"
			        + "</body>"
					+ "</html>"
			        );
			pw.print("<html>"
					+ "<body>" + 
					"Passenger Destination :" + dest
			        + "<br>"
			        + "</body>"
					+ "</html>"
			        );
			pw.print("<html>"
					+ "<body>" + 
					"Date of Journey :" + date
			        + "<br>"
			        + "</body>"
					+ "</html>"
			        );
		}
		else {
			pw.print("Invalid Details");
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
