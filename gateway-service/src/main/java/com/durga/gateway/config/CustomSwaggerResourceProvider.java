package com.durga.gateway.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
@Primary
public class CustomSwaggerResourceProvider implements SwaggerResourcesProvider {

	@Override
	public List<SwaggerResource> get() {
		return Arrays.asList(
			swaggerResource("user-service", "/user-service/v2/api-docs"),
			swaggerResource("product-service", "/product-service/v2/api-docs")
		);
	}

	private SwaggerResource swaggerResource(String name, String location) {
		SwaggerResource resource = new SwaggerResource();
		resource.setName(name);
		resource.setLocation(location);
		resource.setSwaggerVersion("2.0");
		return resource;
	}

}
