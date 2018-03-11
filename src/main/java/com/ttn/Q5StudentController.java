package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Q5StudentController {

    @RequestMapping(value = "/Q5")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("question5");
        model.addObject("msg","Hello World");
        return model;
    }
}
