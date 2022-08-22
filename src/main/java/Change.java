

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Change
 */
public class Change extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Change() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String password = request.getParameter("password");
		String newpass = request.getParameter("newpass");
		
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		session.setAttribute("passwrd",password);
		session.setAttribute("newpas",newpass);
		
		pw.print( "<html>" 
				+ "<body>"
				+ "<form action='ChangePass1'>Enter new Password<br>"
				+ "Old Password : <input type='password' pass='password'><br>"
				+ "New Password : <input type='password' pass='newpass'><br>"
				+ "<input type='submit' value='Change Password'>"
				+ "</form>"
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
