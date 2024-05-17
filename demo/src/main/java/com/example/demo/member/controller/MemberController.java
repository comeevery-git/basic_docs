package com.example.demo.member.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Tag (name = "Members", description = "회원 관련")
@RestController
@RequestMapping ("/api/members")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

	@Operation (tags = "Members", summary = "회원 전체 조회")
	@GetMapping
	public ResponseEntity<Object> getMembers(HttpServletRequest request) {
		List<String> data = List.of("member1", "member2", "member3");
		return ResponseEntity.ok(data);
	}

	@Operation (tags = "Members", summary = "회원 상세 조회")
	@GetMapping("/{memberId}")
	public ResponseEntity<Object> getMember(HttpServletRequest request,
											@Parameter (description = "회원 아이디", example = "member1") @PathVariable ("memberId") final String memberId) {
		return ResponseEntity.ok(memberId);
	}

}
