package Elas_Tech_ADA.mod1;  // Pacote do exemplo (igual ao seu código anterior)

import java.util.List;  // Import necessário para usar List

public class ExemploLambda {

    /*
    Uma expressão lambda é um recurso introduzido no Java 8 para facilitar a programação funcional.
    Ela permite que você escreva código de forma mais concisa e tratável, representando uma função anônima
    (sem nome) que pode ser passada como argumento para métodos ou armazenada em variáveis.

    Sintaxe Básica:

        (parameters) -> { corpo da função }

        Parâmetros: Lista de entradas (pode ser vazia, um ou mais). Exemplo: ou '(n)' '(a, b)'
        Seta (->): Separa os parâmetros do corpo.
        Corpo: O código que será executado. Pode ser uma expressão simples (sem chaves) ou um bloco com chaves
        para múltiplas linhas.
    */

    public static void main(String[] args) {
        // 1. Criando uma lista de nomes (fonte de dados)
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Diana", "Eva");

        // 2. Usando Stream com lambdas para processar a lista
        // - filter(): Filtra apenas nomes que começam com 'A' ou 'B' (usando lambda para condição)
        // - map(): Transforma cada nome filtrado para maiúsculo (usando lambda para transformação)
        // - forEach(): Imprime cada nome processado (usando lambda para ação)
        nomes.stream()
                .filter(nome -> nome.startsWith("A") || nome.startsWith("B"))
                // Lambda: Verifica se o nome começa com 'A' ou 'B'

                .map(nome -> nome.toUpperCase())
                // Lambda: Converte o nome para maiúsculo

                .forEach(nome -> System.out.println("Nome processado: " + nome));
                // Lambda: Imprime o nome com uma mensagem
    }
}
