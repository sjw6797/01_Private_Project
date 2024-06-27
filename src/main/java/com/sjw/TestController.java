package com.sjw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping(value ="/test/hello")
	@ResponseBody
	public String helloRuckus(Model model) {
		return "Hello Ruckus";
	}
}