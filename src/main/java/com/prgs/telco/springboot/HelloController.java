package com.prgs.telco.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
 
@RequestMapping("/helloworld.html")
public ModelAndView hello() {
 
  String helloWorldMessage = "Hello world from mvc!";
  return new ModelAndView("hello", "message", helloWorldMessage);
}
}
