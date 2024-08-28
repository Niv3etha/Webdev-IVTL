package Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Student.Entity.StudentDetails;
import Student.service.StudentService;

@RestController
@RequestMapping("studentdetails")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<StudentDetails> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public StudentDetails addStudent(@RequestBody StudentDetails student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    public StudentDetails updateStudent(@PathVariable int id, @RequestBody StudentDetails studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
    
    @GetMapping("/showPage")
    public String home() {
        return "index";
    }
    
}
