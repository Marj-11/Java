package week9.ex5;

import java.util.List;

public class FilmApp {

    public static void main(String[] args) {

        FilmSummarizer film = new FilmSummarizer();
        List<String> m = film.getTop4RatedLowBudget();
        System.out.println(m);



    }
}
