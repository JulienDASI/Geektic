package com.iut.julien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class GeekController {
	@Autowired
	GeekService geekSrv;
	
	@RequestMapping(method = RequestMethod.GET)
	public String accueil(ModelMap model) {
		return "index";
	}
}

