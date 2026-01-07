package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentSubmissionDto {


        private String studentAdmissionId;
        private SubmissionType submissionType;
        private int courseId;
        private int assignmentId;
        private String className;

        private String fileUrl;
        private String fileName;
        private String fileType;


        private LocalDateTime submissionDate;
    }


