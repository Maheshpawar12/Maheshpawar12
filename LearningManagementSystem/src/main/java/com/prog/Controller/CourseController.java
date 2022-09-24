package com.prog.Controller;

import com.prog.Model.Course;
import com.prog.Service.CourseService;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@RequestMapping("/addcourse")
	public String addcourse(@RequestParam String name,String Duration,String Location,int Fees) {
		Course c=new Course();
		c.setName(name);
		c.setDuration(Duration);
		c.setLocation(Location);
		c.setFees(Fees);
		service.save2(c);
		return "Dashboard";
	}
	
//	@RequestMapping("/showdata")
//	public ModelAndView show(Model m) {
//		List<Course> course =service.getAllCourses();
//		ModelAndView mv=new ModelAndView("Course");
//		mv.addObject("Course",course);
//		return mv;
//	}
//	@PostMapping("/updatecourse")
//	public String update(@ModelAttribute Course c) {
//		service.update(c);
//		return "Dashboard";
//	}
		@GetMapping("/delete")
		public String delete(@PathVariable int id) {
			service.delete(id);
			return "Dashboard";
		}
	

}
