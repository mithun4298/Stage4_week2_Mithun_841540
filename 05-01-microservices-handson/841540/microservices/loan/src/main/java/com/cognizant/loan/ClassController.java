/**
 * 
 */
package com.cognizant.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mithun
 *
 */
@RestController
@RequestMapping("/loan")
public class ClassController {
	@GetMapping("/{number}")
		public String Controller() {
			return "{ number: \"H00987987972342\", type: \"car\", loan: 400000, emi: 3258, tenure: 18 }";
			
		}
}
