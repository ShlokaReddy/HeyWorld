package com.example.HeyWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeyWorld {
	@RequestMapping("/")
	String home() {
		return "Hey World, Smile!";
	}
}