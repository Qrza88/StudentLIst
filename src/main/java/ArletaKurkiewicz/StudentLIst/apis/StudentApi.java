package ArletaKurkiewicz.StudentLIst.apis;


import ArletaKurkiewicz.StudentLIst.objects.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class StudentApi {
    private List<Student> studentList;

    public StudentApi() {
        this.studentList = new ArrayList<>();
    }

    @PostMapping("/addStudent")
    public boolean addStudent(@RequestBody Student student) {
        return studentList.add(student);
    }

    @GetMapping("/getLIst")
    public List<Student> getStudentList() {
        return studentList;
    }
}