package com.prog.Repository;

import com.prog.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query(value = "select* from user where email=?1 and password=?2",nativeQuery = true)
public void findByEmailANdPassword(String email,String password);
}
