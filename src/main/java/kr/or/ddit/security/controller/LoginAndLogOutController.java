package kr.or.ddit.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.navi.alarm.service.SseEmitters;

@Controller
public class LoginAndLogOutController {
	
	@GetMapping("/myLogin")
	public String loginForm() {
		return "login";
	}
	
	@GetMapping("/myLogout")
	public String logoutForm() {
		return "logout";
	}
}
