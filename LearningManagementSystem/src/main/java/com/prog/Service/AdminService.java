package com.prog.Service;

import javax.transaction.Transactional;

import com.prog.Model.Admin;
import com.prog.Repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class AdminService {
	
	@Autowired
	AdminRepository repo;
	
	public void save1(Admin a) {
		repo.save(a);
	}

}
