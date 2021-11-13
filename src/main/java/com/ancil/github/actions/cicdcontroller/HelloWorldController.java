package com.ancil.github.actions.cicdcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping
	public String helloworld() {
		return "HelloWorld! This is a demo project for GitHub Actions CI CD";
	}
}
