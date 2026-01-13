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
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AiCatGradeRequest {

    private String submissionId;
    private String studentId;

    private String catId;

    private String topic;

    private CatData catData;

    private Map<String, String> studentAnswers;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class CatData {
        private String catId;
        private LocalDateTime generatedAt;
        private String difficultyLevel;
        private int totalQuestions;
        private double totalMarks;

        private List<MultipleChoiceQuestion> multipleChoice;
        private List<TrueFalseQuestion> trueFalse;
        private List<ShortAnswerQuestion> shortAnswer;
    }


    @Data
    public static class MultipleChoiceQuestion {
        private String question;
        private Map<String, String> options;
        private String correctAnswer;
        private String explanation;
    }

    @Data
    public static class TrueFalseQuestion {
        private String question;
        private Boolean correctAnswer;
        private String explanation;
    }

    @Data
    public static class ShortAnswerQuestion {
        private String question;
        private List<String> keyPoints;
        private String sampleAnswer;
    }
}
