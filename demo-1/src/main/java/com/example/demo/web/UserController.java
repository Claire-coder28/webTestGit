package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();
	
	@RequestMapping("/create")
	public String create(User user) {
		System.out.println(user);
		users.add(user);
		
		
		return "index"; 
	}
}
