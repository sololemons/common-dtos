package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllSubmissionsDto {
    private String submissionName;
    private String submissionCourseName;
    private String submissionDate;
    private String submissionStatus;
    private String submissionType;
    private String targetId;
    private String submissionId;
}
