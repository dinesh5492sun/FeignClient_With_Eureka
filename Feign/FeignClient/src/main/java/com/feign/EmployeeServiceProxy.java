package com.feign;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


//@FeignClient(name = "EmployeeSearch",url="localhost:9999") //hard-coded URL
//@FeignClient("warehouse") //..use Eureka "Client ID" instead
//@RibbonClient(name = "SpringBootMkyongExample", configuration = HelloServiceConfiguration.class)
//@FeignClient(name="EmployeeSearch",url="${foo.ribbon.listOfServers}")
@FeignClient(name="FeignSecondServer")
public interface EmployeeServiceProxy {
	@RequestMapping("/employee/find/{id}")
	public EmployeeInfo findById(@PathVariable(value = "id") String id);

	@RequestMapping("/employee/findall")
	public Collection<EmployeeInfo> findAll();
}

/*
 Ribbon is automatically enabled
 -Eureka gives our application all "client" that match the given Client ID
 -Ribbon automatically applies load balancing
 -Feign handles the code 
 
 */

