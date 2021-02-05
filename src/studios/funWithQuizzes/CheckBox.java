package studios.funWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CheckBox extends Question {

    private ArrayList<String> answers;
    private ArrayList<String> nonAnswers;
    private ArrayList<String> options;

    public CheckBox(String question, String[] answers, String[] nonAnswers) {
        super(question);
        this.answers = new ArrayList<String>(Arrays.asList(answers));
        this.nonAnswers = new ArrayList<String>(Arrays.asList(nonAnswers));
        this.options = new ArrayList<String>(this.answers);
        this.options.addAll(this.nonAnswers);
        Collections.shuffle(this.options);
    }

    @Override
    public String toString() {
        String output = this.getQuestion() + "\n";
        for (int i = 0; i < options.size(); i++) {
            char letter = (char)(97+i);
            output = output + "\t" + letter + ") " + options.get(i) + "\n";
        }
        return output + "Choose one or more answers: ";
    }

    @Override
    public double gradeAnswer(String answersString) {
        double score = 0;
        ArrayList<String> answerArr = new ArrayList<String>(Arrays.asList(answersString.split("")));
        for (String answerChar: answerArr) {
            int charCode = Character.valueOf(answerChar.charAt(0));
            if(charCode<97 || charCode >= options.size()+97) continue;
            int index = charCode - 97;
            String answer = options.get(index);
            if(this.answers.contains(answer)) {
                score++;
            } else {
                score--;
            }
        }
        if(score < 1) {
            return 0;
        } else {
            return score / this.answers.size();
        }

    }
}
