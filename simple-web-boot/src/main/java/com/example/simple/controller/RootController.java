package com.example.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class RootController {
	@GetMapping("")
	public String index(Model model) {
		System.out.println("RootController!");
		model.addAttribute("msg", "RootControllerが呼ばれました");
		return "index";
	}
}
