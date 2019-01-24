package week10.ex1;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PokemonSummarizer {
    public static void main(String[] args) {


        PokemonReader reader = new PokemonReader();
        List<Pokemon> pokemons = reader.getPokemon("week10/ex1/pokemon.csv");

        getSpeed(pokemons);
        getWater(pokemons);
        getAttack(pokemons);
        getTop5(pokemons);


    }

    private static void getSpeed(List<Pokemon> pokemons) {
        List<String> speed = pokemons.stream()
                .map(e -> "pokemon: " + e.getName() + "| Speed: " + e.getSpeed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 5 Pokemon sorted by speed:");
        speed
                .forEach(System.out::println);
    }

    private static void getWater(List<Pokemon> pokemons) {
        Set<String> water = pokemons.stream()
                .filter(e->e.getType1().equalsIgnoreCase("water"))
                .map(e-> "pokemon: " + e.getName() + "| Attack: " + e.getAttack())
                .limit(5)
                .collect(Collectors.toSet());

        System.out.println("Water Pokemons : ");
        water
                .forEach(System.out::println);
    }

    private static void getTop5(List<Pokemon> pokemons) {
        List<String> top5 = pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getAttack).reversed())
                .map(pokemon -> "Pokemon : " + pokemon.getName() + " | Attack: " + pokemon.getAttack())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Top 5 Pokemon sorted by attack:");
        top5
                .forEach(System.out::println);
    }

    private static void getAttack(List<Pokemon> pokemons) {
        List<Integer> compare = pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getAttack))
                .map(e -> e.getAttack())
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(compare);
    }





}





