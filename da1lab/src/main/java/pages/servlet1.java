package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//wc reads this only once  @web appln deployment time time 
//wc creates an empty hash map 
//wc populates URL map
//key=/tes1
//value pages.servlet1
@WebServlet(value="/test1",loadOnStartup=2)//internally they are interfaces
public class servlet1 extends HttpServlet {

	@Override
	public void destroy() {
		System.out.println("destroy" + Thread.currentThread());

	}

	@Override
	public void init() throws ServletException {
		System.out.println("init" + Thread.currentThread());

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get"+Thread.currentThread());
		//set resp content type to text/html
		resp.setContentType("text/html");
		//get Pw to send char ,buffer data (resp) to clnt
		try(PrintWriter pw =resp.getWriter()){
			pw.print("<h3>Welcome to servlet </h3>"+getClass() +"Time Stamp" +LocalDateTime.now());
			
		}//web container call //pw.flush() -->buf contents are send /flushed to response ->>pw.close()
	
	}

}
