package zajecia.oop.quiz.question;

import java.util.Arrays;

/**
 * Created by Szymon on 2017-04-25.
 */
public class Question {
    private String question;
    private int correctAnswer;
    private String[] answers;

    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
    }

    public boolean checkAnswer(int answer) {
        return this.correctAnswer == answer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answers=" + Arrays.toString(answers) +
                '}';
    }
}
