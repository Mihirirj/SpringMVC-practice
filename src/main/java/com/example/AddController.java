package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class AddController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView add(@Valid @ModelAttribute("myForm") MyForm myForm, BindingResult result, RedirectAttributes redirectAttributes) {
        System.out.println("Entering add method");

        // Perform validation
        if (result.hasErrors()) {
            System.out.println("Validation errors found");
            // Return to the form with validation errors
            return new ModelAndView("index", "myForm", myForm);
        }

        // If no validation errors, continue processing
        System.out.println("POST request received");
        System.out.println("Name: " + myForm.getName());

        // Redirect to success page or display page
        return new ModelAndView("display", "myForm", myForm);
    }
}
