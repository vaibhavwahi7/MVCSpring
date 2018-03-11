package com.ttn;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *Q2 Now remove AbstractController and useMultiActionController for StudentController which contains 2 actions one action renders a jsp view and another action uses HttpServletResponse to show the output on the Web browser.
 */
public class Q2StudentController extends MultiActionController{

    public ModelAndView dummy(HttpServletRequest httpServletRequest,
                              HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    public void dummy2(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>HELLO World</b>");
    }


}
