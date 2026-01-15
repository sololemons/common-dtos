package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto  implements AssessmentQuestion{
    private Integer questionId;
    private String text;
    private int marks;
    private Set<String> options;
    private String correctAnswer;
}
