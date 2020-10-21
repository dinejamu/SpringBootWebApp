package com.example.springboot_jpa_rest_postgresql.project1.Dao;

import com.example.springboot_jpa_rest_postgresql.project1.Model.Course;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DaoRepo extends JpaRepository<Course, Integer> {

    /*@Query("Select cid,cname,cprice,email from Course order by cid asc ")
    List<Course> sortbyidASC();*/
}
