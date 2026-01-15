package com.shared.dtos;

import java.util.List;
import java.util.Set;

public interface AssessmentQuestion {

    Integer getQuestionId();
    String getText();
    Set<String> getOptions();
    String getCorrectAnswer();
    int getMarks();
}
