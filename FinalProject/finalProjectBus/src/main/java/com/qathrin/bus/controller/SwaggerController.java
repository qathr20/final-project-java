package com.qathrin.bus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {
	@RequestMapping("/")
	public String index() {
		return "redirect:swagger-ui.html";
	}

}