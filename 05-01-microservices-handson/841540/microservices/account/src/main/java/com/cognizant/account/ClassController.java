package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Mithun
 *
 */
@RestController
public class ClassController {
	
	@GetMapping("/account/{number}")
	public String Controller() {
		return "{ number: \"00987987973432\", type: \"savings\", balance: 234343 }";
	}
}
