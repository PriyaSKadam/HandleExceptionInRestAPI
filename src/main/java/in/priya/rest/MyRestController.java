package in.priya.rest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/welcome")
	public String welcomeMessage()
	{
		int a=20/0;
		String msg="Welcome to PriyaIT";
		
		return msg;
	}

	/*//Local Exception
	@ExceptionHandler(value=Exception.class)
	public String errorPage()
	{
		return "Some error occurred ..Please try again...";
	}*/
}
