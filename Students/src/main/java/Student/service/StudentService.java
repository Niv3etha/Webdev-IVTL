package Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Student.Entity.StudentDetails;
import Student.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDetails> getAllStudents() {
        return (List<StudentDetails>) studentRepository.findAll();
    }

    public StudentDetails addStudent(StudentDetails student) {
        return studentRepository.save(student);
    }

    public StudentDetails updateStudent(int id, StudentDetails studentDetails) {
    	StudentDetails student = studentRepository.findById(id).orElseThrow(null);
        student.setName(studentDetails.getName());
        student.setDob(studentDetails.getDob());
        return studentRepository.save(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
