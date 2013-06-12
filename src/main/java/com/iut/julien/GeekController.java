package com.iut.julien;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/geek", method=RequestMethod.GET)
public class GeekController {

    /*@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/plain");
		response.getWriter().println("Bonjour");
		
		List<String> liste = new ArrayList<String>();
		
		liste.add("Le spectacle des pigeons");
		liste.add("Le spectacle des requins");
		liste.add("Le spectacle des arbustes");
		liste.add("Le spectacle des pommiers");
		
		request.setAttribute("liste", liste);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request , response);
		
		
		
	}*/
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
}

