package controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	public HelloController() {
		super();
	}
	
	@RequestMapping(value = "/")
	public ModelAndView freshStart() throws IOException {
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("message", "Welcome - This HelloWorld application shows navigation options in a Java + Spring WebApplication");
		return mav;
	}
	
	@RequestMapping(value = "/hello")
	public String hello(Model model) throws IOException {
		model.addAttribute("message", "Another navigation option.");
		return "hello";
	}

	@RequestMapping(value = "/hello/{thing}")
	public ModelAndView helloThing(@PathVariable String thing) {
		ModelAndView mav = new ModelAndView("helloThing");
		mav.addObject("thisThing", thing);
		return mav;
	}
	
	@RequestMapping(value = "/moreHello")
	public ModelAndView helloWorld() throws IOException {
		ModelAndView helloworld = new ModelAndView("moreHello");
		return helloworld;
	}

}
