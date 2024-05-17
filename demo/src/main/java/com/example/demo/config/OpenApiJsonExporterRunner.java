package com.example.demo.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenApiJsonExporterRunner implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		String openApiJson = restTemplate.getForObject("http://localhost:8080/v3/api-docs", String.class);
		Files.write(Path.of("docs/openapi.json"), openApiJson.getBytes());
	}
}