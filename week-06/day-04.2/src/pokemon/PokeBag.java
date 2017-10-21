package pokemon;

import java.util.ArrayList;

public class PokeBag {
    static ArrayList<Pokemon> pokeBag;

    public static void main(String[] args) {
        // Create a PokeBag class that can store multiple pokemons from different types. Add 5 pokemons to your PokeBag.
        // There are 3 kind of pomenons:
        // - Pikachu, who says “Pika-pika” and has 12 HP (health point)
        // - Bubasaur, who says “Bulba-saur” and has 10 HP
        // - Charmander, who says “Char-char” and has 10 HP
        // Every pokemon has a random strength between 1 and 10.
        // Pokemons can say their sound (see above) when their Speak method is called. The Speak method should return the pokemon’s sound.
        // Create a function that returns the pokemon with the highest strength. In case of equal strengths, it’s your choice which one to return.
        //
        // Example:
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Pikachu());
        // pokeBag.add(new Bulbasaur());
        // pokeBag.add(new Charmander());
        //
        // System.out.println(pokeBag.get(0).speak());
        // This should print Pika-pika
        //
        // Pokemon stongestPokemon = pokeBag.getStrongest();
        // Should return the pokemon with the highest strength value
        // PokeBag pokeBag = new PokeBag();\\

        pokeBag = new ArrayList<>();
        pokeBag.add(new Pikachu());
        pokeBag.add(new Pikachu());
        pokeBag.add(new Pikachu());
        pokeBag.add(new Bulbasaur());
        pokeBag.add(new Charmander());

        System.out.println(pokeBag.get(0).speak());
        System.out.println(pokeBag.get(1).speak());
        System.out.println(pokeBag.get(2).speak());
        System.out.println(pokeBag.get(3).speak());
        System.out.println(pokeBag.get(4).speak());

        System.out.println(pokeBag.get(0).strength);
        System.out.println(pokeBag.get(1).strength);
        System.out.println(pokeBag.get(2).strength);
        System.out.println(pokeBag.get(3).strength);
        System.out.println(pokeBag.get(4).strength);

        Pokemon strongestPokemon = PokeBag.getStrongest();
        System.out.println(strongestPokemon.speak());
    }

    private static Pokemon getStrongest() {
        Pokemon strong = new Pokemon();
        for (int i = 0; i < pokeBag.size(); i++) {
            if (pokeBag.get(i).strength == strong.strength){
                strong = pokeBag.get(i);
            } else if (pokeBag.get(i).strength > strong.strength)
                strong = pokeBag.get(i);
        }
        return strong;
    }
}