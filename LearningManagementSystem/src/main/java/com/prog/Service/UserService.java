package com.prog.Service;

import javax.transaction.Transactional;

import com.prog.Model.User;
import com.prog.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public void save(User u) {
		repo.save(u);
		
		
	}
	
	public void find(String Email,String Passeword)
	{
		repo.findByEmailANdPassword(Email, Passeword);
	}
}
