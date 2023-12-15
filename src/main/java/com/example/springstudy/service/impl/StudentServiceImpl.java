package com.example.springstudy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springstudy.entity.*;
import com.example.springstudy.entity.dto.SelectCourseDto;
import com.example.springstudy.mapper.CourseViewMapper;
import com.example.springstudy.mapper.StudentCourseMapper;
import com.example.springstudy.mapper.StudentMapper;
import com.example.springstudy.mapper.UserRoleMapper;
import com.example.springstudy.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    UserRoleMapper userRoleMapper;
    StudentMapper studentMapper;
    CourseViewMapper courseViewMapper;
    StudentCourseMapper studentCourseMapper;

    @Override
    public Student GetStudent(User user) {

        QueryWrapper<Student> studentQueryWrapper = new QueryWrapper<>();
        QueryWrapper<User_role> userRoleQueryWrapper = new QueryWrapper<>();
        userRoleQueryWrapper.eq("uid",user.getUid());

        String sno = userRoleMapper.selectOne(userRoleQueryWrapper).getSno();
        if(sno==null){
            return null;
        }

        studentQueryWrapper.eq("sno",sno);
        return studentMapper.selectOne(studentQueryWrapper);
    }

    @Override
    public List<CourseView> GetLearningCourses(String sno) {
        return courseViewMapper.GetCoursesBySno(sno);
    }

    @Override
    public int SelectCourse(SelectCourseDto selectCourseDto) {
        //TODO : 懒得写了
        return 0;
    }
}