package com.spring.TeamProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("head", "/WEB-INF/main/header.jsp");
		model.addAttribute("container1", "/WEB-INF/main/container1.jsp");
		model.addAttribute("container2", "/WEB-INF/main/container2.jsp");
		model.addAttribute("container3", "/WEB-INF/main/container3.jsp");
		model.addAttribute("footer", "/WEB-INF/main/footer.jsp");
		return "index";
	}
	
	
}
