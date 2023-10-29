package com.app;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	
	public HomePageController() {
		System.out.println("in cnstor of " .getClass());
	}
	//Add request Handling method to forward the client to index.jsp
	@RequestMapping("/")//can Intercept  get/put/post/delete..
	public ModelAndView showHomePage() {
		System.out.println("In  showHomePage");
		//Api o.s.w.s ModelAndView(String viewname,String  attrName Object value)
		return new ModelAndView("/index", "timestamp", LocalDateTime.now());
		//Handler method rets-->ModelnView ->DispatchServlert->SendLogicalViewName->ViewResolver 
		//-->AVN :?WEB-INF/views/Index.jsp-->D.S
		//chks for model attrs -->yes --> saves it under the requestScope (why  we are using server pull )
		//--> Rd rd=req.getRD(WEB-INF/views/index.jsp);
		//rd.forward(req,resp)-->JSP-->${...}
	}

}
