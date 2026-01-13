package com.shared.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AiGradeResponse {

    private String submissionId;
    private String studentId;
    private String topic;
    private double totalPoints;
    private double maxPoints;
    private double percentage;
    private String gradeLetter;

    private List<QuestionResult> questionResults;
    private String overallFeedback;
    private Map<String, Double> topicMastery;
    private LocalDateTime gradedAt;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class QuestionResult {
        private String questionId;
        private String questionType;
        private double maxPoints;
        private double awardedPoints;
        private Boolean isCorrect;
        private String feedback;
        private List<String> strengths;
        private List<String> improvements;
    }
}
