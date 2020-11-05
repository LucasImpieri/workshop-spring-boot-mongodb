package com.impieri.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impieri.workshopmongo.domain.User;
import com.impieri.workshopmongo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
		
	public List<User> findAll(){
		return repo.findAll();
	}
	
}
