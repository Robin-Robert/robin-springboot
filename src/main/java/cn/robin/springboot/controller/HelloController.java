package cn.robin.springboot.controller;




import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	private final Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello(Model model) {
		log.info("log 有了");
		 model.addAttribute("name", "Dear");
         return "hello";
	}
}
