package kr.co.pk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import kr.co.pk.service.UserService;

@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
}
