package Student.repository;

import Student.Entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentDetails, Integer> {
}
