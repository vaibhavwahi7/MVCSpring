package com.ttn;

import domains.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Q9StudentController {

    @RequestMapping(value = "/Q9", method = RequestMethod.GET)
    String submitForm() {
        return "question9";
    }
    @RequestMapping(value = "/Q9", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(Student student) {
        return "FirstName:" + student.getFirstName() + " SecondName:" + student.getLastName();
    }

}
