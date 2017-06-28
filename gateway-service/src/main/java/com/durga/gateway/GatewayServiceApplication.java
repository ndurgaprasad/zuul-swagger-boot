package com.durga.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netflix.zuul.ZuulFilter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableZuulProxy
public class GatewayServiceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

	@Bean
	public ZuulFilter requestLoggingFilter() {
		return new RequestLoggingFilter();
	}

}
