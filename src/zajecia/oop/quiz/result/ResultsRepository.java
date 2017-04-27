package zajecia.oop.quiz.result;

import java.io.IOException;

/**
 * Created by Szymon on 2017-04-27.
 */
public interface ResultsRepository {
    Result[] getAllResults();

    Result[] getTopResults(int n);

    void add(Result result);
}
