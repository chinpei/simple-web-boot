package com.example.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simple")
public class SimpleController {

	@GetMapping("")
	public String index(Model model) {
		System.out.println("SimpleController");
		model.addAttribute("msg", "SimpleControllerが呼ばれました");
		return "simple-index";
	}
}
