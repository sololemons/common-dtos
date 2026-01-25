package com.shared.dtos;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class GradedAssignmentDetailsDto {

    private Long submissionId;
    private String studentAdmissionId;
    private String assignmentDescription;
    private String assignmentName;

    private List<AssignmentFileDto> files;

    private Double awardedMarks;
    private Double maxMarks;
    private Double percentage;
    private String feedback;
    private String gradedAt;
}
