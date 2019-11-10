package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxController {

	@GetMapping("/ajax")
	public String loadAjaxPage(ModelMap model) throws Exception{

		return "index";
	}

	
}