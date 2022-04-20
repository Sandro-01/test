package com.max.openshift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpenshiftController {
  @RequestMapping("/")
  public ModelAndView homepage() {
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("Home"); 
	  return mv;
  }
 
 
}
