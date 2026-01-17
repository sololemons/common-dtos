package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentSubmissionResponseDto {

    private Long submissionId;
    private String studentAdmissionId;
    private String className;
    private Long courseId;
    private Long moduleId;
    private Long targetId;
    private String submissionStatus;
    private LocalDateTime submissionDate;

    private List<AssignmentFileDto> files;
}
