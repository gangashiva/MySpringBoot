package com.example.demo.courses.controller;

import com.example.demo.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

  @GetMapping("/courses")
  public List<Course> getAllCourses(){
    //return Arrays.asList(new Course(1,"Learn Microservices", "in28Minutes"));
    List<Course> al = new ArrayList<>();
    Course c1 = new Course(1,"JAVA","Shiva");
    Course c2 = new Course(2,"Android","Gangashiva");
    Course c3 = new Course(3,"PHP","Kruthi");
    Course c4 = new Course(4,"Python","Raja");
    Course c5 = new Course(5,"Ruby","Babu");
    al.add(c1);
    al.add(c2);
    al.add(c3);
    al.add(c4);
    al.add(c5);
    return al;
  }

  @GetMapping("/courses/1")
  public List<Course> getCourseById(){
    return Arrays.asList(new Course(1,"Angular", "in28Minutes"));
  }



}
