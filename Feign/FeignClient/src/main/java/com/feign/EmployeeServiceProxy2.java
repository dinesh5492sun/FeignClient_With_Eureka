package com.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(name = "EmployeeSearch",url="localhost:9999") //hard-coded URL
//@FeignClient("warehouse") //..use Eureka "Client ID" instead
//@RibbonClient(name = "SpringBootMkyongExample", configuration = HelloServiceConfiguration.class)
//@FeignClient(name = "EmployeeSearch2", url = "${foo1.ribbon.listOfServers}")
@FeignClient(name="FeignThirdServer")
public interface EmployeeServiceProxy2 {
	
	@RequestMapping("/employee/find/{id}")
	public EmployeeInfo findById(@PathVariable(value = "id") String id);
}
