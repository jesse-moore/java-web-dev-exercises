package studios.funWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiChoice extends Question {

    private String answer;
    private ArrayList<String> nonAnswers;
    private ArrayList<String> options;

    public MultiChoice(String question, String answer, String[] nonAnswers) {
        super(question);
        this.answer = answer;
        this.nonAnswers = new ArrayList<String>(Arrays.asList(nonAnswers));
        this.options = new ArrayList<String>(this.nonAnswers);
        this.options.add(this.answer);
        Collections.shuffle(this.options);
    }

    @Override
    public String toString() {
        String output = this.getQuestion() + "\n";
        for (int i = 0; i < options.size(); i++) {
            char letter = (char)(97+i);
            output = output + "\t" + letter + ") " + options.get(i) + "\n";
        }
        return output + "Choose one answer: ";
    }

    @Override
    public double gradeAnswer(String answerString) {
        int index = Character.valueOf(answerString.charAt(0)) - 97;
        if(answer.equals(options.get(index))) {
            return 1;
        } else {
            return 0;
        }
    }
}
