package com.example.springstudy.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetCourseProgressDto {

    /**
     * 还没想好
     */

    private long cno;
    private int progress;

}
