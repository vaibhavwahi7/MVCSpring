package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class Q7StudentController {
    @RequestMapping(value = "/Q7/{firstName}/{secondName}", method = RequestMethod.GET)
    public ModelAndView path(@PathVariable Map<String, String> requestMap) {

        ModelAndView model = new ModelAndView();
        model.setViewName("question7");
        String fname = requestMap.get("firstName");
        String lname = requestMap.get("secondName");
        model.addObject("msg", fname);
        model.addObject("msg1", lname);
        return model;
    }
}