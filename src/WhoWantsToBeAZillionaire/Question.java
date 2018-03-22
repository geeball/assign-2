public class Question {
    private String questionText;
    private int questionDifficulty;
    private String questionCategory;

    public Question(String questionText, int questionDifficulty, String questionCategory) {
        this.questionText = questionText;
        this.questionDifficulty = questionDifficulty;
        this.questionCategory = questionCategory;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getQuestionDifficulty() {
        return questionDifficulty;
    }

    public void setQuestionDifficulty(int questionDifficulty) {
        this.questionDifficulty = questionDifficulty;
    }

    public String getQuestionCategory() {
        return questionCategory;
    }

    public void setQuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }

    public String correctAnswer() {
        return correctAnswer();
    }

    public int incorrectAnswer1() {
        return incorrectAnswer1();
    }

    public int incorrectAnswer2() {
        return incorrectAnswer2();
    }

    public int incorrectAnswer3() {
        return incorrectAnswer3();
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionText='" + questionText + '\'' +
                ", questionDifficulty=" + questionDifficulty +
                ", questionCategory='" + questionCategory + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
