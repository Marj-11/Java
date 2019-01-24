package week9.ex5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSummarizer {

    private FilmReader reader = new FilmReader();
    private List<Film> films = reader.getFilms("week9/ex5/films.csv");

    public List<Film> getTop3Rated() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getTop3RatedLongerThan3Hours() {
        return films.stream()
                .filter(e -> e.getRuntime() > 180)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Film> getTop4MostExpensive() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<Film> getTop4MostExpensiveShorterThan90Minutes() {
        return films.stream()
                .filter(e -> e.getRuntime() < 90)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
    }

    public List<String> getTop4RatedLowBudget() {
        return films.stream()
                .filter(e -> e.getScore() > 7)
                .filter(e -> e.getBudget() > 50000)
                .filter(e -> e.getBudget() < 500000)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .map(e -> e.getTitle())
                .collect(Collectors.toList());
    }


}

