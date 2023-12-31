package com.example.springstudy.controller.student;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.springstudy.domain.ResponseResult;
import com.example.springstudy.entity.dto.TempUidDto;
import com.example.springstudy.service.StudentService;
import com.example.springstudy.utils.UserThreadLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 学生查找自己选择的课程时调用
@RestController
public class ShowLearningCourseController {
    private StudentService studentService;

    @Autowired
    public ShowLearningCourseController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/student/showcourse")
    public ResponseResult ShowLearningCourse(){
        return studentService.GetLearningCourses(UserThreadLocal.get().getUid());
    }

}
