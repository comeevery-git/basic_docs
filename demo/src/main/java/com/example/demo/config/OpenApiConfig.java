package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("메인 페이지 제목")
						.description("메인 페이지 설명")
						.version("1.0.0")
						.summary("메인 페이지 요약")
						.contact(new io.swagger.v3.oas.models.info.Contact()
								.name("lydia")
								.url("https://www.notion.so/lydia-log/PERSON-LIKE-A-SPONGE-5d3b7544b8a24c7a9c1617a363af8213?pvs=4")
								.email("comeevery@gmail.com")
						)
				);
	}

}