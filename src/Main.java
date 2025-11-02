
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemon = new ArrayList<>();

        pokemon.add( new Pokemon("Bulbasaur", "Grama", "Venenoso", 318, 49, 49, 65, 65, 45));
        pokemon.add( new Pokemon("Charmander", "Fogo", "Nenhum", 309, 52, 43, 60, 50, 65));
        pokemon.add( new Pokemon("Squirtle", "Água", "Nenhum", 314, 48, 65, 50, 64, 43));
        pokemon.add( new Pokemon("Pikachu", "Elétrico", "Nenhum", 320, 55, 40, 50, 50, 90));
        pokemon.add( new Pokemon("Eevee", "Normal", "Nenhum", 325, 55, 50, 45, 65, 55));
        pokemon.add( new Pokemon("Jigglypuff", "Normal", "Fada", 270, 45, 20, 45, 25, 20));
        pokemon.add( new Pokemon("Machop", "Lutador", "Nenhum", 305, 80, 50, 35, 35, 35));
        pokemon.add( new Pokemon("Gastly", "Fantasma", "Venenoso", 310, 35, 30, 100, 35, 80));
        pokemon.add( new Pokemon("Onix", "Pedra", "Terra", 385, 45, 160, 30, 45, 70));
        pokemon.add( new Pokemon("Abra", "Psíquico", "Nenhum", 310, 20, 15, 105, 55, 90));
        pokemon.add( new Pokemon("Geodude", "Pedra", "Terra", 300, 80, 100, 30, 30, 20));
        pokemon.add( new Pokemon("Ponyta", "Fogo", "Nenhum", 410, 85, 55, 65, 65, 90));
        pokemon.add( new Pokemon("Magikarp", "Água", "Nenhum", 200, 10, 55, 15, 20, 80));
        pokemon.add( new Pokemon("Gengar", "Fantasma", "Venenoso", 500, 65, 60, 130, 75, 110));
        pokemon.add( new Pokemon("Snorlax", "Normal", "Nenhum", 540, 110, 65, 65, 110, 30));
        pokemon.add( new Pokemon("Lucario", "Lutador", "Aço", 525, 110, 70, 115, 70, 90));
        pokemon.add( new Pokemon("Garchomp", "Dragão", "Terra", 600, 130, 95, 80, 85, 102));
        pokemon.add( new Pokemon("Infernape", "Fogo", "Lutador", 534, 104, 71, 104, 71, 108));
        pokemon.add( new Pokemon("Torterra", "Grama", "Terra", 525, 109, 105, 75, 85, 56));
        pokemon.add( new Pokemon("Empoleon", "Água", "Aço", 530, 86, 88, 111, 101, 60));

        Scanner entrada = new Scanner(System.in);
        int parar = 0;
        while (parar != 4) {
            System.out.println("Bem vindo ao mini banco de dados POKEMONS!!");
            System.out.println(
                    "----------------------\n" +
                            "1. Listar pokemons\n" +
                            "2. Adicionar pokemon\n" +
                            "3. Remover pokemon\n" +
                            "4. Sair\n" +
                            "-----------------------");
            parar = entrada.nextInt();
            switch (parar){
                case 1:
                    System.out.println("🔥 Lista de Pokémons 🔥");
                    for (Pokemon p : pokemon) {
                        System.out.println(p); // automaticamente chama toString()
                    }
                    break;
                case 2:
                    System.out.println("Adicionar pokemon randomico");
                    pokemon.add(Pokemon.gerarPokemonAleatorio());
                    break;
                case 3:
                    System.out.println("Remover pokemon");
                    Pokemon.removerPokemon(pokemon, new Scanner(System.in));
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Digite um digito entre 1 a 4.");
            }

        }



    }
}