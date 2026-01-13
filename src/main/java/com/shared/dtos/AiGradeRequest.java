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
public class AiGradeRequest {

    private String submissionId;
    private String studentId;
    private String quizId;
    private String topic;
    private QuizData quizData;
    private Map<String, String> studentAnswers;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class QuizData {
        private String quizId;
        private LocalDateTime generatedAt;
        private String difficultyLevel;
        private int totalQuestions;
        private List<MultipleChoiceQuestion> multipleChoice;
        private List<TrueFalseQuestion> trueFalse;
        private List<ShortAnswerQuestion> shortAnswer;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class MultipleChoiceQuestion {
        private String question;
        private Map<String, String> options;
        private String correctAnswer;
        private String explanation;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class TrueFalseQuestion {
        private String question;
        private Boolean correctAnswer;
        private String explanation;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ShortAnswerQuestion {
        private String question;
        private List<String> keyPoints;
        private String sampleAnswer;
    }
}
