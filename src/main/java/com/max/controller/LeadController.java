package com.max.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {
		
	@RequestMapping("/viewCreate")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	
}
