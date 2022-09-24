package com.prog.Controller;

import com.prog.Service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {
	
	@Autowired
	public AdminService service;
	
	@RequestMapping("/login")
	public String mainpage() {
		return "login";
	}

}
