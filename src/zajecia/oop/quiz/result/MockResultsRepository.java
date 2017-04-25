package zajecia.oop.quiz.result;

/**
 * Created by Szymon on 2017-04-25.
 */
public class MockResultsRepository {

    private Result[] results;

    public MockResultsRepository() {
        this.results = new Result[2];
        this.results[0] = new Result("Andrzej", 3);
        this.results[1] = new Result("Jan", 2);
        //dodac do results dodatkowo 2 wyniki
    }

    public Result[] getAllResults() {
        return results;
    }

    //ZADANIE DOMOWE
    //Napisac metode, podmienic w wyswietlaniu wynikow, i poprawic wyswietlanie wynikow
    public Result[] getTopResults(int n) {
        return null;
    }

}
