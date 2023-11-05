package com.example.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController 
{
	@GetMapping("/profile")
	public String profile (Model model)
	{
		/* Create infomation */
		List<Info> profile = new ArrayList<Info>();
		profile.add(new Info("full name", "Tran Huy"));
		profile.add(new Info("nick name", "Shazam"));

		/* Out infomation into Model */
		model.addAttribute("MyProfile", profile);
		
		return "profile";
		
	}
}
