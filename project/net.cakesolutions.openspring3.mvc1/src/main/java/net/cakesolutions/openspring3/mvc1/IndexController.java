package net.cakesolutions.openspring3.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@ResponseBody
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String foo() {
		return "Hello, world";
	}

}
