package com.kalyan.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("devops")
public class DevopsRestController {

	@GetMapping("/first")
	public String devopsFirst() {
		return "First rest controller for devops";
	}
}
