package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentDetails {

    private String className;
    private int courseId;
    private int moduleId;
    private String assessmentType;
    private int targetId;
}
