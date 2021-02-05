package studios.funWithQuizzes;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {

        Quiz quiz = new Quiz(new Question[] {
                new CheckBox("Question",
                    new String[] {"Answer1"},
                    new String[] {"nonAnswer1", "nonAnswer2"}),
                new MultiChoice("Question2", "Answer1", new String[] {"nonAnswer1", "nonAnswer2"}),
                new TrueFalse("Question 3", true)
        });

        quiz.addQuestion(new MultiChoice("Question4", "Answer1", new String[] {"nonAnswer1", "nonAnswer2"}));

        quiz.startQuiz();
        quiz.gradeQuiz();
    }
}
