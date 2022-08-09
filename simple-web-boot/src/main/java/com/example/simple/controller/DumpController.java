package com.example.simple.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dump")
public class DumpController {

	@GetMapping("")
	public String index(Model model, HttpServletRequest request) {
		System.out.println("DescController");
		
		List<String[]> headers = new ArrayList<>();
		
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			Enumeration<String> headerValues = request.getHeaders(headerName);
			while(headerValues.hasMoreElements()) {
				String headerValue = headerValues.nextElement();
				headers.add(new String[] {headerName,headerValue});
			}
		}
		model.addAttribute("headers", headers);
		
		System.out.println("Cookie");
//		request.getCookies()
		
		return "dump-index";
	}
}
