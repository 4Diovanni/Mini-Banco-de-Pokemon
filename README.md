# ⚔️ Mini Banco de Dados Pokémon (Java)

## 🌟 Visão Geral do Projeto

Este projeto é uma aplicação de console desenvolvida em Java que simula um mini banco de dados de Pokémon. O objetivo principal é demonstrar a aplicação prática de conceitos de **Programação Orientada a Objetos (POO)** e a organização de código em um contexto divertido e familiar.

A aplicação permite ao usuário:
1.  Visualizar uma lista inicial de Pokémon pré-definidos.
2.  Adicionar novos Pokémon gerados aleatoriamente.
3.  Remover Pokémon existentes pelo nome.

Este projeto é ideal para portfólios, pois evidencia a capacidade de estruturar um sistema utilizando os pilares da POO.

## 💻 Estrutura e Arquitetura do Código

O projeto segue o princípio de **Separação de Responsabilidades**, sendo composto por duas classes principais:

### 1. `Pokemon.java` (A Classe Modelo)

Esta classe atua como o **Modelo** (ou *Blueprint*) para todos os objetos Pokémon no sistema.

| Elemento | Descrição | Conceito de POO |
| :--- | :--- | :--- |
| **Atributos** | Armazena os dados de um Pokémon (nome, tipos, status base como `vida`, `ataque`, `defesa`, etc.). | **Encapsulamento** |
| **Construtor** | Método especial que garante que cada objeto `Pokemon` seja criado com todos os seus atributos essenciais inicializados. | **Instanciação** |
| **`toString()`** | Método sobrescrito que fornece uma representação textual formatada do objeto, melhorando a legibilidade no console. | **Polimorfismo** |
| **Métodos Estáticos** | Funções utilitárias como `gerarPokemonAleatorio()` e `removerPokemon()`, que pertencem à classe e não a uma instância específica. | **Métodos de Classe** |

### 2. `Main.java` (A Classe de Execução)

Esta classe contém a lógica de execução da aplicação e o ponto de entrada (`main`):

*   **Gerenciamento de Coleção**: Utiliza um `ArrayList<Pokemon>` para armazenar e gerenciar múltiplos objetos Pokémon.
*   **Interação com o Usuário**: Implementa um *loop* de menu que utiliza a classe `Scanner` para receber comandos do usuário.
*   **Instanciação**: Demonstra a criação de objetos `Pokemon` e a chamada dos métodos definidos na classe `Pokemon`.

## ✨ Detalhes da Programação Orientada a Objetos (POO)

O projeto é uma demonstração clara dos conceitos fundamentais de POO em Java:

| Conceito | Aplicação no Projeto |
| :--- | :--- |
| **Classe e Objeto** | A classe `Pokemon` é a definição. Cada entrada na lista (`ArrayList`) em `Main.java` é um **Objeto** (instância) dessa classe. |
| **Encapsulamento** | Os atributos do Pokémon são privados (embora não explicitamente com `private`, o que seria uma melhoria futura) e são manipulados através de métodos definidos na própria classe, controlando o acesso aos dados. |
| **Polimorfismo** | A sobrescrita do método `toString()` na classe `Pokemon` permite que o objeto seja impresso de forma personalizada quando referenciado em um `System.out.println()`. |
| **Reutilização de Código** | A lógica de criação e manipulação de Pokémon está centralizada na classe `Pokemon`, permitindo que a classe `Main` se concentre apenas na interface e no fluxo de controle. |

## 🛠️ Instalação e Execução

Para rodar este projeto, você precisará ter o **Java Development Kit (JDK)** instalado em sua máquina.

### Pré-requisitos

*   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) (versão 8 ou superior)

### Passos para Execução

1.  **Salve os Arquivos**: Certifique-se de que os arquivos `Main.java` e `Pokemon.java` estejam no mesmo diretório.
2.  **Compile as Classes**: Abra o terminal ou prompt de comando no diretório onde os arquivos estão salvos e execute o comando de compilação:

    ```bash
    javac Main.java Pokemon.java
    ```

3.  **Execute a Aplicação**: Após a compilação bem-sucedida, execute a classe principal:

    ```bash
    java Main
    ```

## 📝 Funcionalidades

Ao executar o programa, um menu interativo será exibido:

1.  **Listar Pokémons**: Exibe todos os Pokémon atualmente no banco de dados, utilizando a formatação definida pelo método `toString()` da classe `Pokemon`.
2.  **Adicionar Pokémon**: Gera um novo Pokémon com nome, tipos e status aleatórios, demonstrando o uso do método estático `gerarPokemonAleatorio()`.
3.  **Remover Pokémon**: Permite ao usuário digitar o nome de um Pokémon para removê-lo da lista. A remoção é feita pelo método estático `removerPokemon()`.
4.  **Sair**: Encerra a aplicação.

## 🤝 Contribuição

Sinta-se à vontade para usar este projeto como base para estudos ou para adicionar novas funcionalidades, como:

*   Implementar um sistema de batalha simples.
*   Adicionar validação de entrada de dados mais robusta.
*   Utilizar modificadores de acesso (`private`) para reforçar o Encapsulamento.
*   Implementar Herança para criar subclasses de Pokémon (Ex: `PokemonLendario`).
*   Criar uma interface gráfica (GUI) para substituir a interface de console.
