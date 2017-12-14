package hu.szampontkft.hnorbert90.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hu.szampontkft.hnorbert90.repository.UserRepository;
import hu.szampontkft.hnorbert90.service.UserService;

@Controller
@RequestMapping(value = "/admin")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired 
	UserService userService;
	
	@RequestMapping("/newuser")
	public String newUser(@RequestParam("nev") String nev,@RequestParam("email") String email,@RequestParam("password") String password) {
		userService.newUser(nev, email, password);
		return "redirect:/data";
	}
	
	@RequestMapping("/updateuser")
	public String updateUser(@RequestParam("id") Long id,@RequestParam("nev") String nev,@RequestParam("email") String email,@RequestParam("password") String password) {
		userService.updateUser(id,nev, email, password);
		return "redirect:/data";
	}
	
	@RequestMapping("/deleteuser")
	public String deleteUser(@RequestParam("id") Long id) {
		userService.deleteUser(id);
		return "redirect:/data";
	}
	
}
