package Values;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/value")
public class Check_value extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		String num1=req.getParameter("number");
		
		int num= Integer.parseInt(num1);
		
		/*if(num%5==0)
		{
			pw.println("Namaste");
		}*/
		 if(num%(5*7)==0)
		{
			pw.println("Welcome!!");
		}
		else if(num%7==0)
		{
			pw.println("Salute");
		}
		else if(num%5==0)
		{
			pw.println("Namaste");
		}
		else
		{
			pw.println(num);
		}
	}

}
