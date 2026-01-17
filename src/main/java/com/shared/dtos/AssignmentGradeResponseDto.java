package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentGradeResponseDto {
    private AssessmentDetails assessmentDetails;
    private Long submissionId;
    private String admissionId;
    private Long awardedMarks;
    private Long maxMarks;
    private Long percentage;
    private String feedback;
    private String gradedAt;
}
