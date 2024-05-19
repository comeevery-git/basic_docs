package com.example.demo.common.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Tag (name = "Common", description = "공통")
@RestController
@RequestMapping ("/api/commons")
@RequiredArgsConstructor
@Slf4j
public class CommonController {

	@Operation (tags = "Common"
			, summary = "Summary"
			, description = "Description")
	@GetMapping("/ping")
	public ResponseEntity<Object> getSidePage(HttpServletRequest request) {
		return ResponseEntity.ok("Hello, World!");
	}

}
