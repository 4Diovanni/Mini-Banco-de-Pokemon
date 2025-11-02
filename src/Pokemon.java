import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Pokemon {
    /// Atributos basicos
    String nome;
    String tipo1;
    String tipo2;
    /// Atributos de Status
    int vida;
    int ataque;
    int defesa;
    int ataque_especial;
    int defesa_especial;
    int velocidade;
    /// Atributo tipagem
    ArrayList<String> tipagemPokemon = new ArrayList<>();

    /// Construtor
    public Pokemon(String nome, String tipo1, String tipo2, int vida, int ataque, int defesa,
                   int ataque_especial, int defesa_especial, int velocidade) {
        this.nome = nome;
        tipagemPokemon.add(tipo1);
        tipagemPokemon.add(tipo2);
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.ataque_especial = ataque_especial;
        this.defesa_especial = defesa_especial;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "🐉 Pokémon: " + nome +
                "\n Tipos: " + tipagemPokemon +
                "\n Vida: " + vida +
                "\n Ataque: " + ataque +
                "\n Defesa: " + defesa +
                "\n Ataque Especial: " + ataque_especial +
                "\n Defesa Especial: " + defesa_especial +
                "\n Velocidade: " + velocidade +
                "\n----------------------------";
    }

    /// Método para gerar Pokémon aleatório
    public static Pokemon gerarPokemonAleatorio() {
        Random rand = new Random();

        // Lista de nomes possíveis
        String[] nomes = {
                "Charmander", "Bulbassauro", "Squirtle", "Pikachu", "Eevee", "Gengar", "Lucario",
                "Snorlax", "Mewtwo", "Mew", "Charizard", "Dragonite", "Blastoise", "Gyarados",
                "Jigglypuff", "Onix", "Scyther", "Lapras", "Arcanine", "Machamp",
                "Umbreon", "Espeon", "Alakazam", "Vaporeon", "Jolteon", "Flareon"
        };

        String nome = nomes[rand.nextInt(nomes.length)];

        // Lista de tipos possíveis
        String[] tipos = {"Normal", "Fogo", "Água", "Planta", "Elétrico", "Gelo", "Lutador", "Voador", "Psíquico", "Inseto", "Pedra", "Terra", "Veneno", "Fantasma", "Metal", "Dragão", "Sombrio", "Fada"};

        // Sorteia dois tipos diferentes
        String tipo1 = tipos[rand.nextInt(tipos.length)];
        String tipo2 = tipos[rand.nextInt(tipos.length)];
        while (tipo2.equals(tipo1)) { // evita tipo repetido
            tipo2 = tipos[rand.nextInt(tipos.length)];
        }

        // Gera valores aleatórios dentro de um escopo
        int vida = rand.nextInt(301) + 200;            // 200 a 500
        int ataque = rand.nextInt(51) + 20;            // 20 a 70
        int defesa = rand.nextInt(51) + 20;            // 20 a 70
        int ataqueEspecial = rand.nextInt(71) + 30;    // 30 a 100
        int defesaEspecial = rand.nextInt(71) + 30;    // 30 a 100
        int velocidade = rand.nextInt(81) + 20;        // 20 a 100

        return new Pokemon(nome, tipo1, tipo2, vida, ataque, defesa, ataqueEspecial, defesaEspecial, velocidade);
    }

    public static void removerPokemon(ArrayList<Pokemon> nomeLista, Scanner sc) {
        if(nomeLista.isEmpty()){
            System.out.println("Lista vázia, Nenhum pokemon para remover.");
            return;
        }
        for (Pokemon p : nomeLista) {
            System.out.println(p.nome);
        }
        System.out.println("Digite o nome do pokemon que deseja remover: ");
        String nome = sc.nextLine().trim();

        /// Verifica se tem pokemon com o nome desejado
        boolean encontrado = false;
        for (Pokemon p : nomeLista){
            if(nome.equalsIgnoreCase((p.nome))){
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum Pokémon encontrado com o nome: " + nome);
            return;
        }

        // remove todos com o mesmo nome
        nomeLista.removeIf(p -> p.nome.equalsIgnoreCase(nome));
        System.out.println("Pokémon(s) com o nome '" + nome + "' removido(s) com sucesso!");
    }
}
