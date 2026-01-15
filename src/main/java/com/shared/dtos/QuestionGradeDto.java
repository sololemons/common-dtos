package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionGradeDto {
    private String questionId;
    private String questionType;
    private double maxPoints;
    private double awardedPoints;
    private Boolean isCorrect;
    private String feedback;

}
