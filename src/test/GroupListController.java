package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroupListController {
	@RequestMapping("/")
    public String index() {
		return "grouplist";
    }
	
	@RequestMapping("/example")
	public String to_example() 
	{
		return "example";
	}
	
	@RequestMapping("/mirko")
	public String to_mirko() 
	{
		return "mirko";
	}
	
	@RequestMapping("/member")
	public String to_member() 
	{
		return "member";
	}
}