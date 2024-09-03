package syksy24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("main")
	@ResponseBody
	public String returnMessage() {
		return "Eka SB Sovellukseni";
	}
	
	@RequestMapping("sayHelloAndAge")
	@ResponseBody
	public String returnGreeting(@RequestParam (name="name", required=false, defaultValue="Muumi") String etunimi, 
			@RequestParam int age) {
		return "Hei " + etunimi + ", " + age + " vuotta";
	}
}


