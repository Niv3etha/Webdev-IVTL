package Student.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import Student.service.StudentService;

@Controller
@RequestMapping("studentpage")
public class StudentPageController {

    @Autowired
   // private StudentService studentService;
    
    @GetMapping("/showPage")
    public String home() {
        return "index";
    }
    
}
