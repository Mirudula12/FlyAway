

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Payment
 */
public class Payment5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String person=(String)session.getAttribute("noperson");
		String sr=(String)session.getAttribute("source");
		String dest=(String)session.getAttribute("destination");
	     
		
		if(person.equals(1)) {
	
			pw.print("Flight : " + "United Airlines");
			pw.print("Source : " + sr +"\n");
			pw.print("Destination : " + dest +"\n");
			pw.print("Ticket Price : " + "75000" +"\n");
			 
		}
		else {
			String amt="75000";
			String total = String.valueOf(Integer.parseInt(person) * Integer.parseInt(amt)) ;
			
			 pw.print("Flight : " + "United Airlines" +"\n");
				pw.print("Source : " + sr +"\n");
				pw.print("Destination : " + dest +"\n");
				pw.print("Ticket Price : " + total +"\n");
		}
		
		
		pw.print( "<html>"
				+ "<body>"
				+ "<a href='carddetails.jsp'>Pay</a>"
				+ "</body>"
				+ "</html>"
			
				);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
