package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseAssessmentSummaryDto {
    private List<CatInfoDto> cats;
    private List<AssignmentInfoDto> assignments;
}
