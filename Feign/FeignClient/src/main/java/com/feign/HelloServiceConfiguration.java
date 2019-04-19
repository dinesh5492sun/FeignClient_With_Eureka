/*package com.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class HelloServiceConfiguration {
    
	@Autowired
    IClientConfig ribbonClientConfig;
   
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
    
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}*/