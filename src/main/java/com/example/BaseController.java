package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseController {


    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView testService(HttpServletRequest request) {
    	MyForm myForm = new MyForm();
    	
    	System.out.println("GET request received");
        System.out.println("Initializing myForm with default values");
        return new ModelAndView("index", "myForm", myForm); 
    }
}




