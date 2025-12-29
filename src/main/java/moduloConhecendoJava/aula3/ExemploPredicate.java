package Elas_Tech_ADA.mod1;
import java.util.function.Predicate;

public class ExemploPredicate {


    public static void main(String[] args){
        // 1. Declaração e Inicialização de um Predicate<String>
        // Predicate é uma interface funcional do pacote java.util.function
        // que representa um predicado (função booleana) de um argumento.
        // O tipo String indica que o predicado opera sobre objetos String.
        // A expressão lambda 'str -> str.length() > 10' implementa o método 'test' do Predicate.
        // Ela retorna 'true' se o comprimento da string for maior que 10, e 'false' caso contrário.
        Predicate<String> isLong = str -> str.length() > 10;

        // 2. Testando o Predicate com uma string curta
        // O método 'test(T t)' do Predicate avalia o predicado no argumento fornecido.
        // "uma string" tem 10 caracteres (sem contar as aspas).
        // 10 > 10 é falso, então o resultado é 'false'.
        IO.println(isLong.test("uma string"));

        // 3. Testando o Predicate com uma string longa
        // "uma string longa demais" tem 23 caracteres.
        // 23 > 10 é verdadeiro, então o resultado é 'true'.
        IO.println(isLong.test("uma string longa demais"));
    }
}
