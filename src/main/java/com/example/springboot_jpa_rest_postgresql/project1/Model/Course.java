package com.example.springboot_jpa_rest_postgresql.project1.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private int cid;
    private String cname;
    private String email;
    private int cprice;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }

    public Course(int cid, String cname, String email, int cprice) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.cprice = cprice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", email='" + email + '\'' +
                ", cprice=" + cprice +
                '}';
    }
    public Course() {

    }
}
