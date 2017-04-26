package zajecia.oop.quiz.result;

/**
 * Created by Szymon on 2017-04-25.
 */
public class MockResultsRepository {

    private Result[] results;

    private int resultsCounter;

    public MockResultsRepository() {
        this.resultsCounter = 0;
        this.results = new Result[100];
        add(new Result("Andrzej", 3));
        add(new Result("Jan", 2));
    }

    public Result[] getAllResults() {
        Result[] resultsToReturn = new Result[resultsCounter];
        for (int i = 0; i < resultsCounter; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }

    //ZADANIE DOMOWE
    //Napisac metode, podmienic w wyswietlaniu wynikow, i poprawic wyswietlanie wynikow
    public Result[] getTopResults(int n) {
        Result[] resultsToReturn = new Result[n];
        int loopSize = n < resultsCounter ? n : resultsCounter;
        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }

    public void add(Result result) {
        this.results[resultsCounter] = result;
        resultsCounter++;
    }

}
