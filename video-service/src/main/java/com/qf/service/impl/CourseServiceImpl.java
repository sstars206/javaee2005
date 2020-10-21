package com.qf.service.impl;

import com.qf.dao.CourseMapper;
import com.qf.pojo.Course;
import com.qf.pojo.CourseExample;
import com.qf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findALl() {
        return courseMapper.selectByExample(null);
    }

    @Override
    public List<Course> findBySubjectId(Integer id) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        criteria.andSubjectIdEqualTo(id);

        return courseMapper.selectByExample(courseExample);
    }

    @Override
    public Course findById(Integer id) {
        return courseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Course> findAll(Integer subjectId) {
        return courseMapper.findAll(subjectId);
    }

}
