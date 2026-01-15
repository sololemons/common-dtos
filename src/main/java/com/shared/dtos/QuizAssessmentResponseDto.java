package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizAssessmentResponseDto implements AssessmentResponse {
    private String title;
    private List<QuestionDto> questions;

}
