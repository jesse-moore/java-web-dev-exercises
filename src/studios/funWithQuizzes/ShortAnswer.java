package studios.funWithQuizzes;

public class ShortAnswer extends Question {

    public ShortAnswer(String question) {
        super(question);
    }

    @Override
    public String toString(){
        return this.getQuestion() + "\n";
    }

    @Override
    public double gradeAnswer(String answer) {
        if(answer.length() >= 80) return 1;
        return 0;
    }
}
