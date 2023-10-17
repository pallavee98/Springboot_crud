package com.example.crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllers {
    @Autowired
    StudentService studentService;

    //--------create operation (POST) -----------//
    @PostMapping(path="create")
    public void CreateStudent(@RequestBody Student student){
        studentService.CreateStudent(student);
    }

    //Read (get)
    @GetMapping("/read")
    public Student readStudentById(@RequestParam(name="id") Integer value){
        return studentService.readStudent(value);
    }

    //update (PUT) = Read + Create
    @PutMapping("update")
    public void updateStudent(@RequestParam(name="id") Integer value,@RequestBody Student student){
           studentService.updateStudent(value,student);
    }

    //Delete (delete) = Read + delete
    @DeleteMapping("delete")
    public void deleteStudent(@RequestParam(name="id") Integer value){
        studentService.deleteStudent(value);

    }



    
}
