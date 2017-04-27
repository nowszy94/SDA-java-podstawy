package zajecia.oop.quiz;

import zajecia.oop.quiz.question.MockQuestionsRepository;
import zajecia.oop.quiz.question.Question;
import zajecia.oop.quiz.result.FileResultsRepository;
import zajecia.oop.quiz.result.MockResultsRepository;
import zajecia.oop.quiz.result.Result;
import zajecia.oop.quiz.result.ResultsRepository;

/**
 * Created by Szymon on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        ResultsRepository resultsRepository = new FileResultsRepository("C:\\Users\\Szymon\\projekt\\SDA-java-podstawy\\results.txt");
        QuizInterface quizInterface = new QuizInterface();

        boolean gameFlag = true;
//        int decision = 0;
//        while(decision != 0) {
        while(gameFlag) {
            int decision = quizInterface.menu();
            switch (decision) {
                case 1:
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

                    Result result = new Result(playerName, correctAnswersCounter);
                    quizInterface.showResult(result);
                    resultsRepository.add(result);
                    break;
                case 2:
                    quizInterface.showTopResults(resultsRepository.getTopResults(10));
                    break;
                case 0:
                    gameFlag = false;
                    break;
                default:
                    System.out.println("Wrong decision");
            }
        }
        quizInterface.afterGameEnded();
    }
}
