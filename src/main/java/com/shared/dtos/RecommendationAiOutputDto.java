package com.shared.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RecommendationAiOutputDto {

    @JsonProperty("student_id")
    private String studentId;

    @JsonProperty("individual_module_reviews")
    private List<IndividualModuleReview> individualModuleReviews;

    @JsonProperty("collective_feedback")
    private CollectiveFeedback collectiveFeedback;

    @JsonProperty("generated_at")
    private LocalDateTime generatedAt;


    @Data
    public static class IndividualModuleReview {

        @JsonProperty("module_id")
        private String moduleId;

        @JsonProperty("module_name")
        private String moduleName;

        private String score;

        private double percentage;

        @JsonProperty("performance_level")
        private String performanceLevel;

        private String feedback;

        @JsonProperty("concepts_to_review")
        private List<String> conceptsToReview;
    }


    @Data
    public static class CollectiveFeedback {

        @JsonProperty("overall_performance")
        private OverallPerformance overallPerformance;

        @JsonProperty("critical_gaps")
        private String criticalGaps;

        private String recommendations;

        @JsonProperty("weak_question_types")
        private List<WeakQuestionType> weakQuestionTypes;

        @JsonProperty("total_failed_questions")
        private int totalFailedQuestions;
    }


    @Data
    public static class OverallPerformance {

        @JsonProperty("total_score")
        private int totalScore;

        @JsonProperty("total_max")
        private int totalMax;

        private int percentage;

        private String level;
    }


    @Data
    public static class WeakQuestionType {

        private String type;

        private double percentage;

        private int attempted;
    }
}
