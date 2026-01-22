package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatSubmissionDto {

    private String studentAdmissionId;
    private SubmissionType submissionType;
    private int courseId;
    private int catId;
    private String className;
    private List<AnswerDto> answerText;
    private LocalDateTime submissionDate;



}
