package com.example.springboot_jpa_rest_postgresql.project1.Service;

import com.example.springboot_jpa_rest_postgresql.project1.Dao.DaoRepo;
import com.example.springboot_jpa_rest_postgresql.project1.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Serviceimp {
    @Autowired
    private DaoRepo daoRepo;

    public Course SaveAll(Course course) {
        return daoRepo.save(course);
    }

    public List<Course> ShowAllstudents() {
    return  daoRepo.findAll();
    }

    public Course Showbyid(int cid) {
        Course course=daoRepo.findById(cid).orElse(null);
        return course;
    }

    public Course UpdateById(int cid, Course course) {
        Course course1=daoRepo.findById(cid).orElse(null);
        course1.setCname(course.getCname());
        course1.setEmail(course.getEmail());
        course1.setCprice(course.getCprice());
        final Course obj=daoRepo.save(course1);
        return obj;
    }

    public Map<String, Boolean> DeleteById(int cid) {
        Course course=daoRepo.findById(cid).orElse(null);
        daoRepo.delete(course);
        Map<String,Boolean> status=new HashMap<>();
        status.put("Deleted This Record.",Boolean.TRUE);
        return status;
    }
}
