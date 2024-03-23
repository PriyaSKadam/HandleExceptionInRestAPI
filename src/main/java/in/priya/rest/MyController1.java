package in.priya.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController1 {
	
	@GetMapping("/greet")
	public String greetMessage()
	{
		String msg="Good Morning";
		String s1=null;
		System.out.println(s1.length());
		return msg;
	}

}
