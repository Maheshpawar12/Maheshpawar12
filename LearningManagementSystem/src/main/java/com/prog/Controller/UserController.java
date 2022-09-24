package com.prog.Controller;

import com.prog.Model.User;
import com.prog.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	public UserService service;
	
	@RequestMapping("/register")
	public String home() {
		return "register";
	}
	
	@RequestMapping("/userlogin")
	public String register(@RequestParam String email,String password) {
//		service.find(email, password);
		return "Dashboard";
	}
	
	@RequestMapping("/addUser")
	public String regis(@RequestParam String name,String password,Long mno,String email) {
		User u=new User();
		u.setName(name);
		u.setMobile(mno);
		u.setPassword(password);
		u.setEmail(email);
		service.save(u);
		return "login";
	}
	
	@GetMapping("/User")
	public String user() {
		return "login";
	}

	@RequestMapping("/Dashboard")
	public String subject() {
		return "Dashboard";
	}
}

