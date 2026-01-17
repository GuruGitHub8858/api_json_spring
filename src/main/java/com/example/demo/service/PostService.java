package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.PostRepository;
import com.example.demo.model.Posts;
@Service
public class PostService {
	
	private static final String URL="https://jsonplaceholder.typicode.com/posts"; 
	
	@Autowired
	private RestTemplate restTemplete;
	@Autowired
	private PostRepository postRepo;
	
	public Posts[] getAllPost() {
		return restTemplete.getForObject(URL,Posts[].class);
	}
	
	public void postAllJson() {
	  Posts[] post =restTemplete.getForObject(URL,Posts[].class);
	  postRepo.saveAll(List.of(post));
	}

}
