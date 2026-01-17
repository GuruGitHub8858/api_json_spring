package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Posts;
import com.example.demo.service.PostService;

@Controller
public class DisplayController {
	@Autowired
    private PostService postService;
	
	@GetMapping("/display")
	public String displayPost(Model model) {
		Posts[] post=postService.getAllPost();
		model.addAttribute("index",post);
		
		return "index";
	}
}
