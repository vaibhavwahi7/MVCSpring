package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Q3StudentController {

    @RequestMapping(value = "/Q3")
    public ModelAndView index() {
        ModelAndView model=new ModelAndView();
        model.setViewName("question3");
        return model;
    }

}