package studios.funWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private double correctAnswers = 0;

    public Quiz(Question[] q) {
        this.questions = new ArrayList<Question>(Arrays.asList(q));
    }

    public void startQuiz(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.size(); i++) {
            System.out.print((i+1) + ") ");
            System.out.print(questions.get(i).toString());
            String answer = scanner.nextLine();
            correctAnswers += questions.get(i).gradeAnswer(answer);
        }
    }

    public void gradeQuiz(){
        System.out.println("Quiz Grade: " + this.correctAnswers + "/" + this.questions.size());
    }

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }
}
