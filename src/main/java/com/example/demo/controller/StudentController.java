Package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.postdata(student);
    }

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllData();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable int id) {
        return studentService.getData(id);
    }

    @PutMapping("/{id}")
    public StudentEntity updateStudent(
            @PathVariable int id,
            @RequestBody StudentEntity student) {

        return studentService.updateData(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteData(id);
    }
}