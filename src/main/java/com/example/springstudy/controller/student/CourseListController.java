package com.example.springstudy.controller.student;

import com.example.springstudy.domain.ResponseResult;
import com.example.springstudy.entity.CourseView;
import com.example.springstudy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 这个接口是学生选课前调用，作用：显示可选择的可成
@RestController
public class CourseListController {
    private StudentService studentService;

    @Autowired
    public CourseListController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/course/list")
    public ResponseResult courseShow(){

        return studentService.ShowCourses();
    }
}
