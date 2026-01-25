package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatAssessmentResponseDto implements AssessmentResponse {
    private String title;
    private int catId;
    private String courseName;
    private List<QuestionDto> questions;
}
