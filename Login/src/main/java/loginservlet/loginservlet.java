package loginservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public loginservlet() {
        super();
       
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pt= response.getWriter();
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/starr/kog_in");
      String name=request.getParameter("txtname");
      String password=request.getParameter("txtpassword");
      PreparedStatement pstm=conn.prepareStatement( "select name from login where name=? and password=?");
		pstm.setString(1,      name);
		pstm.setString(2,  password);
        ResultSet rs=pstm.executeQuery();
        if(rs.next()) {
        	RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response); 
        }else {
        pt.println("<font color=red size=18>login failed!!<br>");
        pt .println("<a href=login.jsp>Try again");
        }
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		};
	

}
}