package week10.ex1;
import week9.ex2.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {


    private FileReader reader = new FileReader();

    public List<Pokemon> getPokemon(String filepath) {
        return reader.asStream(filepath)
                .skip(1)
                .map(e->e.split(";"))
                .map(column -> new Pokemon(Integer.valueOf(column[0]), column[1],
                        column[2], column[3], Integer.valueOf(column[4]),
                        Integer.valueOf(column[5]), Integer.valueOf(column[6]),
                        Integer.valueOf(column[7]), Integer.valueOf(column[8]),
                        Integer.valueOf(column[9]), Integer.valueOf(column[10]),
                        Integer.valueOf(column[11]),
                        Boolean.valueOf(column[12])))
                .collect(Collectors.toList());
    }

}
