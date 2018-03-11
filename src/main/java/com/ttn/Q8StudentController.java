package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
class Q8StudentController {
    @RequestMapping(value = "/Q8", method = RequestMethod.GET)
    ModelAndView submitForm() {
        ModelAndView model = new ModelAndView();
        model.setViewName("question8");
        return model;
    }

    @RequestMapping(value = "/Q8", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("firstName") String firstName,
                      @RequestParam("lastName") String lastName) {
        return "FirstName: " + firstName + " LastName: " + lastName;
    }
}