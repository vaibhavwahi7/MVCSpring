package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Q10StudentController {


    @RequestMapping(value = "/Q10", method = RequestMethod.GET)

    public ModelAndView Q10(){
        ModelAndView model=new ModelAndView("question10");
        return model;
    }
    @ModelAttribute
    public void defaultAction(Model model){

        model.addAttribute("msg","Hello World");

    }


}
