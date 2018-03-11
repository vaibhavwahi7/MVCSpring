package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Q4StudentController {
    @RequestMapping(value = "/Q4")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView();
        model.setViewName("question4");
        return model;
    }
    @RequestMapping(value = "/Q42")
    @ResponseBody
    String indexanother() {
     String str="Hi Vaibhav";

        return str;
    }

}