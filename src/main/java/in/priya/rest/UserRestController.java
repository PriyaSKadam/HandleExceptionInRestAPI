package in.priya.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.priya.exception.NoUserFoundException;

@RestController
public class UserRestController {
	
	@GetMapping("/user/{id}")
	 public String getUser(@PathVariable("id") Integer id) {
		
		if(id<=100)
		{
			return "Valid id";
		}
		{
			throw new NoUserFoundException("Invalid id");
		}
		 
	 }

}
