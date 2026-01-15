package com.shared.dtos;


import java.util.List;

public interface AssessmentResponse {

    String getTitle();
    List<? extends AssessmentQuestion> getQuestions();
}
