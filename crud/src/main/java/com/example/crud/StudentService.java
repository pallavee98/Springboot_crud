package com.example.crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepisotries studentRepo;


    // create operation 
    public void CreateStudent(Student student){
        studentRepo.save(student);
    }
    
    //Read 
    public Student readStudent(Integer id){
        return studentRepo.findById(id).get();
    }

    //update
    public void updateStudent(Integer id , Student student){
        Student s = readStudent(id);
        s.setName(student.getName());
        // s.setState(student.getState());
        // s.setCourse(student.getCourse());
        studentRepo.save(s);
    }

    public void deleteStudent(Integer id){
        studentRepo.deleteById(id);
    }

    
}
