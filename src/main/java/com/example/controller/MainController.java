package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(path = {"/","/index"})
	public String welcome() {
		return "index";
	}
	@GetMapping("bookmark")
	public String bookmark() {
		return "bookmark";
	}
}
