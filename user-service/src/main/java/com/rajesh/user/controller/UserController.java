package com.rajesh.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.user.entity.User;
import com.rajesh.user.service.UserService;
import com.rajesh.user.valueobjects.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		logger.info("Inside saveUser method of UserController class");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		logger.info("Inside getUserWithDepartment method of UserController class");
		return userService.getUserWithDepartment(userId);
	}
}