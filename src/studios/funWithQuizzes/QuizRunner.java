package studios.funWithQuizzes;

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
        quiz.addQuestion((new ShortAnswer("Short Question")));
        quiz.addQuestion(new LinearScale("Linear Scale Question", 5,4,8));

        quiz.startQuiz();
        quiz.gradeQuiz();
    }
}
