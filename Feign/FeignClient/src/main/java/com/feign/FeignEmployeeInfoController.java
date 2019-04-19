package com.feign;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class FeignEmployeeInfoController {
	@Autowired
	EmployeeServiceProxy proxyService;
	
	@Autowired
	EmployeeServiceProxy2 proxyService1;

	@RequestMapping("/dashboard/feign/{myself}")
	public EmployeeInfo findme(@PathVariable String myself) {
		return proxyService.findById(myself);
	}
	
	@RequestMapping("/dashboards/feign/{myself}")
	public EmployeeInfo findme1(@PathVariable String myself) {
		return proxyService1.findById(myself);
	}
	
	@RequestMapping("/dashboard/feign/peers")
	public Collection<EmployeeInfo> findPeers() {
		return proxyService.findAll();
	}
}
