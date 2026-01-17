package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Posts;
import com.example.demo.service.PostService;


@RestController
//http://localhost:8080/api/getall
@RequestMapping("/api/posts")
	
public class PostController {
    @Autowired
	private PostService postService;
	
	@GetMapping
	public Posts[] getPost() {
		return postService.getAllPost();
	}
	@GetMapping("/test")
	public String test() {
	    return "hello";
	}

}
