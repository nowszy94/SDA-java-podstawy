package zajecia.oop.quiz;

/**
 * Created by Szymon on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        QuizInterface quizInterface = new QuizInterface();

        int decision = quizInterface.menu();
        if (decision == 1) {
            String playerName = quizInterface.insertName();
            quizInterface.beforeStart();

            Question[] questions = questionsRepository.getQuestions();
            int correctAnswersCounter = 0;
            for (int i = 0; i < questions.length; i++) {
                boolean result = quizInterface.showQuestion(questions[i]);
                if (result) {
                    quizInterface.correctAnswer();
                    correctAnswersCounter++;
                } else {
                    quizInterface.incorrectAnswer();
                }
            }

            quizInterface.showResult(playerName, correctAnswersCounter);
        } else if (decision == 2) {
            System.out.println("Result not yet supported");
        } else {
            System.out.println("End of game");
        }
    }


}
