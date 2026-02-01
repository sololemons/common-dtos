package com.shared.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class RecommendationInputDto {

    @JsonProperty("student_id")
    private String studentId;

    private List<ModuleInputDto> modules;


    @Data
    public static class ModuleInputDto {

        @JsonProperty("module_id")
        private String moduleId;

        @JsonProperty("module_name")
        private String moduleName;

        @JsonProperty("module_content")
        private String moduleContent;

        @JsonProperty("max_score")
        private int maxScore;

        @JsonProperty("question_results")
        private List<QuestionResultDto> questionResults;
    }


    @Data
    public static class QuestionResultDto {

        @JsonProperty("question_text")
        private String questionText;

        @JsonProperty("student_answer")
        private String studentAnswer;

        @JsonProperty("correct_answer")
        private String correctAnswer;

        @JsonProperty("awarded_marks")
        private int awardedMarks;

        @JsonProperty("max_marks")
        private int maxMarks;

        @JsonProperty("question_type")
        private String questionType;

        @JsonProperty("is_correct")
        private boolean correct;
    }
}
