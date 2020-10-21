package com.qf.service.impl;

import com.qf.dao.SubjectMapper;
import com.qf.pojo.Subject;
import com.qf.pojo.SubjectExample;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public List<Subject> findAll() {
        return subjectMapper.findAll();
    }

    @Override
    public Subject findSubjectById(Integer id) {
        return subjectMapper.findSubjectById(id);
    }


    @Override
    public List<Subject> findBySubjectByName(String subjectName) {
        SubjectExample subjectExample = new SubjectExample();
        SubjectExample.Criteria criteria = subjectExample.createCriteria();
        criteria.andSubjectNameEqualTo(subjectName);
        return subjectMapper.selectByExample(subjectExample);
    }

}
