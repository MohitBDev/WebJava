package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Course;
import pojos.Student;

/**
 * Servlet implementation class ProcessFormServlet
 */
@WebServlet("/process_form")
public class ProcessFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		//try (PrintWriter pw = response.getWriter()) {
			// get parameter when single value
			//get parameter values when when dropdown list or multiple vlaues to fetch
			String firstName = request.getParameter("fn");
			String lastName = request.getParameter("ln");
			int score = Integer.parseInt(request.getParameter("score"));
			Course selectedCourse = Course.valueOf(request.getParameter("course").toUpperCase());
			//encap details in student object
			Student student=new Student(firstName, lastName, score, selectedCourse);
			//chk if admission to be granted or not
			if(score > selectedCourse.getMinScore())
				student.setAdmitted(true);
			//pw.print("<h4> from 1st page...</h4>");
		//	pw.flush();// it will give error in forward as refuest buffer is empty illegal state exception
			//store the student details under CURRENT REQUEST scope
			request.setAttribute("student_dtls", student);
			//server pull : RequestDispatcher : forward 
			//1. get RD
			// same request is send with attribute 
			RequestDispatcher rd=request.getRequestDispatcher("result");
			//forward
			rd.forward(request, response);
			System.out.println("came back.....");//appears on server side console
			//pw.print("<h5>content after forward....</h5>");
			/*
			 * WC clears/discards resp buffer. 
			 * Suspends the exec of this method
			 * Invokes doPost of the next page(Result page)
			 * last page in the chain(result page) : can generate dyn resp
			 * control of exec comes back n then response is rendered.
			 */
			
	//	}
	}

}
