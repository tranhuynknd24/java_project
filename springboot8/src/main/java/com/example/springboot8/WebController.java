package com.example.springboot8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController 
{
	/* Don nhan request GET */
	@GetMapping("/") 		/* Neu nguoi dung request den dia chi / */
	public String index()
	{
		return "index"; 	/* tra ve file index.html */
	}
	
	@GetMapping("/about")	/* Neu nguoi dung request den dia chi /about */
	public String about()
	{
		return "about";		/* tra ve file about.html */
	}
	
	@GetMapping("/hello")
	public String hello( /* RequestParam "name" se duoc gan gia tri vao bien String */
						 @RequestParam(name = "name", required = false, defaultValue = "")String name, Model model)
	{
		/* Gan model gia tri name nhan duoc */
		model.addAttribute("name", name);
		
		return "hello"; /* Tra ve file hello.html cung voi thong tin trong object Model */
		
	}
}
