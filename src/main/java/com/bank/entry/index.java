package com.bank.entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class index {
	@RequestMapping("/print")
	public String print() {
		return "index";
	}
}
