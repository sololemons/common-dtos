package com.shared.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradeSubmissionEvent {

    private String submissionId;
    private String studentAdmissionId;

    private AssessmentDetails assessmentDetails;
    private String className;

    private double totalPoints;
    private double maxPoints;
    private double percentage;
    private String gradeLetter;

    private List<AiGradeResponse.QuestionResult> questionResults;
    private String overallFeedback;
    private Map<String, Double> topicMastery;

    private LocalDateTime gradedAt;
    private String questionKeyMapJson;

}
