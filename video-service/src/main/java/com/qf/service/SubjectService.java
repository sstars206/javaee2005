package com.qf.service;

import com.qf.pojo.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> findAll();

    Subject findSubjectById(Integer id);

    List<Subject> findBySubjectByName(String subjectName);
}
