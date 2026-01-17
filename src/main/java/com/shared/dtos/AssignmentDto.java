package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentDto {
    private Long assignmentId;
    private String assignmentName;
    private String assignmentDescription;
    private String dueDate;
    private Long totalMarks;
}
