package br.com.caelum.clines.api.users;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

	private final UserService service;

	@GetMapping
	List<UserView> list() {
		return service.findAll();
	}
}
