package com.prog.Service;

import javax.transaction.Transactional;

import com.prog.Model.Course;
import com.prog.Repository.CourseRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CourseService {

	@Autowired
	CourseRepository repo; 
	public List<Course> getAllCourses(){
		return repo.findAll();
	}
	
	public void save2(Course c) {
		repo.save(c);
	}
	
	public void delete(int id)
	{
		repo.deleteById(2);
	}
	
	
}
