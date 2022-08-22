

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangePass
 */
public class ChangePass1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePass1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		HttpSession session=request.getSession();
		//String password=(String)session.getAttribute("passwrd");
		String newpass=(String)session.getAttribute("newpas");
		
		response.setContentType("text/html");
		if(newpass != null) {
			pw.print("Password changed successfully" + "\n");
			pw.print("New Password : " + newpass + "\n");
		}
		else {
			pw.print("Password not changed" + "\n");
		}
		
		pw.println( "<html>"
				+ "<body>"
				+ "<a href='admin.jsp'>Go to Admin page</a>"
				+ "</body>"
				+ "</html>"
				+ "<br>"
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
