package com.qf.service;

import com.qf.pojo.Course;

import java.util.List;

public interface CourseService {

    List<Course> findALl();

    List<Course> findBySubjectId(Integer id);

    Course findById(Integer id);

    List<Course> findAll(Integer subjectId);
}
