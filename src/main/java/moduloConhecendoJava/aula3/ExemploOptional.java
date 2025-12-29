package Elas_Tech_ADA.mod1;

import java.util.Optional;

public class ExemploOptional {

    /*
    'imagine o Optional como um containêr que pode ou não armazenar um objeto'

    Optional.of() - cria um Optional com um valor não nulo
    Optional.empty() - cria um Optional vazio
    Optional.ofNullable() - cria um Optional que pode ser vazio ou conter um valor
    */

    public static void main(String[] args) {

        String nome = "Java";

        // Cria um Optional com valor (não pode ser nulo)
        Optional<String> nomeOptional = Optional.of(nome);

        // Cria um Optional vazio (sem valor)
        Optional<String> nomeOptional2 = Optional.empty();

        // Verifica se o Optional tem valor
        System.out.println(nomeOptional.isPresent());  // true
        System.out.println(nomeOptional2.isPresent()); // false


        String nomeVazio = null;

        // Cria um Optional que aceita nulo
        Optional<String> nomeVazioOptional = Optional.ofNullable(nomeVazio);

        // Executa o println somente se houver valor
        nomeVazioOptional.ifPresent(System.out::println); // não imprime nada


        // Retorna o valor, ou um padrão se estiver vazio
        String nomeOuDefault = nomeVazioOptional.orElse("Java 8\n");
        System.out.println(nomeOuDefault);

        // Retorna o valor, ou gera um novo com lambda
        String nomeOuGerado = nomeVazioOptional.orElseGet(() -> "Java 11\n");
        System.out.println(nomeOuGerado);

        /*
         Lança exceção se o Optional estiver vazio
        nomeVazioOptional.orElseThrow(() -> new RuntimeException("Java 21"));
        */
    }
}
