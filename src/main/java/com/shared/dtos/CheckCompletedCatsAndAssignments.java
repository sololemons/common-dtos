package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckCompletedCatsAndAssignments {
    private String studentAdmissionId;
    private String courseId;
}
