package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradedRequestDto {
    private String studentAdmissionId;
    private String courseName;
    private String className;
    private String message;
    private String quizName;

}
