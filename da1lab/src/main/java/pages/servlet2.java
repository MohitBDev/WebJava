package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */

public class servlet2 extends HttpServlet {
	
	
	
	
	@Override
	public void destroy() {
	System.out.println("In destroy servlet 2"+Thread.currentThread());
	}




	@Override
	public void init() throws ServletException {
		System.out.println("In init servlet 2"+Thread.currentThread());
	}




	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In do getservlet 2"+Thread.currentThread());
		
		
		resp.setContentType("text/html");
		try(PrintWriter pw =resp.getWriter()){
			pw.print("<h5> resp servlet 2</h5> " );
			pw.print("time Stamp" +LocalDateTime.now());
			
		}
		
		
		
		
		
		
	}
}

	
