package hu.szampontkft.hnorbert90.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.szampontkft.hnorbert90.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/data")
	public String data(Model model) {
		model.addAttribute("users",userRepository.findAll());
		return "data";
	}
	
	
}
