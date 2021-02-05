package studios.funWithQuizzes;

public class TrueFalse extends Question{
    private Boolean answer;

    public TrueFalse(String question, Boolean answer ) {
        super(question);
        this.answer = answer;
    }

    @Override
    public String toString() {
        String output = this.getQuestion() + "\n\ta) true\n\tb) false\n";
        return output;
    }

    @Override
    public double gradeAnswer(String answerString) {
        if(answer && answerString.equals("a") || !answer && answerString.equals("b")) {
            return 1;
        } else {
            return 0;
        }
    }
}
