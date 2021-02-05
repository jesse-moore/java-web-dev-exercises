package studios.funWithQuizzes;

public class LinearScale extends Question {
    private int scaleBegin;
    private int scaleEnd;
    private int answer;

    public LinearScale(String question, int answer, int scaleBegin, int scaleEnd) {
        super(question);
        this.scaleBegin = scaleBegin;
        this.scaleEnd = scaleEnd;
        this.answer = answer;
    }

    @Override
    public String toString(){
        String output = this.getQuestion() + "\n";
        for (int i = 0; i < scaleEnd - scaleBegin; i++) {
            char letter = (char)(97+i);
            output = output + "\t" + letter + ") " + (scaleBegin + i) + "\n";
        }
        return output + "Choose one answer: ";
    }

    @Override
    public double gradeAnswer(String answerString) {
        int index = Character.valueOf(answerString.charAt(0)) - 97;
        if(index + scaleBegin == answer) {
            return 1;
        } else {
            return 0;
        }
    }

}
