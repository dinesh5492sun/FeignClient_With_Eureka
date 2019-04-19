package com.example.FeignSecondServer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/account")
public class TestController {
	
	private static final Logger log = LoggerFactory.getLogger("ControllerName");

	
	
	@GetMapping("/employee/find/{id}")
	@ResponseBody
	public EmployeeInfo findme(@PathVariable("id") String id) {
		System.out.println("=======================================START======================================================>");
		System.out.println("the value of myself is"+id);
		EmployeeInfo emp=new EmployeeInfo();
		emp.setAge(26);
		emp.setCompanyName("Accenture");
		emp.setName("Prasanth");
		System.out.println("========================================END=====================================================>");
		return emp;

	}
	
	
}
