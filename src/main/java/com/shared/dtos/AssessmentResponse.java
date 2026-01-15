import com.shared.dtos.AssessmentQuestion;

import java.util.List;

public interface AssessmentResponse {

    String getTitle();
    List<? extends AssessmentQuestion> getQuestions();
}
