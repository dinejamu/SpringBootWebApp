package com.example.springboot_jpa_rest_postgresql.project1.Controller;

import com.example.springboot_jpa_rest_postgresql.project1.Model.Course;
import com.example.springboot_jpa_rest_postgresql.project1.Service.Serviceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    @Autowired
    private Serviceimp serviceimp;

    @PostMapping("/save")
    public Course SaveDetail(@RequestBody Course course){
        return serviceimp.SaveAll(course);
     }

    @GetMapping("/showall")
    public List<Course> ShowallDetails(){
    return serviceimp.ShowAllstudents();
    }

    @GetMapping("/show/{id}")
    public Course showById(@PathVariable(value = "id") int cid){
        return serviceimp.Showbyid(cid);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Course> UpdateDetails(@PathVariable(value = "id") int Cid, @RequestBody Course course){
        Course obj=serviceimp.UpdateById(Cid,course);
        return ResponseEntity.ok(obj);
    }
    @DeleteMapping("/delete/{id}")
    public Map<String,Boolean> DeleteByID(@PathVariable(value = "id") int cid){
        Map<String,Boolean> Status=new HashMap<>();
        Status=serviceimp.DeleteById(cid);
        return Status;
    }
    }
