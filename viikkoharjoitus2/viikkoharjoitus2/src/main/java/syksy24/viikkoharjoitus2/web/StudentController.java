package syksy24.viikkoharjoitus2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import syksy24.viikkoharjoitus2.domain.Student;

import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;


@Controller
public class StudentController {

    @GetMapping("/hello")
    public String helloMessage(@RequestParam(name = "name") String name, @RequestParam(name = "age") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hello";
    }

    @GetMapping("students")
    public String showStudents(Model model) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Maija", "Maijanen"));
        studentList.add(new Student("Miikka", "Miikkanen"));
        studentList.add(new Student("Kaapo", "Kaaponens"));

        model.addAttribute("students", studentList);

        return "students";
    }
    
    
}
