package com.onlinefoodstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	@GetMapping("/products")
	public String viewProducts() {
		return "products";
	}
}
