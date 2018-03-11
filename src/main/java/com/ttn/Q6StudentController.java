package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Q6StudentController {

    @RequestMapping(value = "/Q6", method = RequestMethod.GET)
    public ModelAndView printWelcome() {
        ModelAndView model=new ModelAndView();
        model.setViewName("question6");
        return model;
    }

    @RequestMapping(value = "/first/{firstName}/{lastName}", method = RequestMethod.POST)
    public ModelAndView path(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
        ModelAndView model = new ModelAndView();
        model.setViewName("question6");
        model.addObject("msg", firstName);
        model.addObject("msg1",lastName);
        return model;
    }
}