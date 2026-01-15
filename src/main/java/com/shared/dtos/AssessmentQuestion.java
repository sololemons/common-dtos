import java.util.List;

public interface AssessmentQuestion {

    Long getQuestionId();
    String getText();
    List<String> getOptions();
    String getCorrectAnswer();
    int getMarks();
}
