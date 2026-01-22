package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuleDto {
    private String week;
    private String moduleName;
    private String content;
    private String status;
    private int moduleId;
    private List<QuizAssessmentDto> quizAssessmentDto;

}
