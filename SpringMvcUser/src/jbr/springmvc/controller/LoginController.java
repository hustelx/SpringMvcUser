package jbr.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String showLogin() {
	  System.out.println("Hello");
	  return "login";
	  
  }
  
  @RequestMapping(value = "/Welcome", method = RequestMethod.GET)
  public String welcomePage(){
	  return "welcome";
  }
  
  
}