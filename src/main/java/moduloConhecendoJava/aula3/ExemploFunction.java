package Elas_Tech_ADA.mod1;
import java.util.function.Function;

public class ExemploFunction { //transformação de dados:

public static void main(String[] args){
        // 1. Declaração e Inicialização de uma Function<String, Integer>
        // Function é uma interface funcional do pacote java.util.function.
        // Ela representa uma função que recebe um argumento de um tipo (T, aqui String)
        // e produz um resultado de outro tipo (R, aqui Integer).
        //
        // A expressão lambda 'str -> str.length()' implementa o método 'apply' da Function.
        // Ela recebe uma string 'str' e retorna seu comprimento (um Integer).
        Function<String, Integer> stringSize =
            str -> str.length();
            
        // 2. Aplicando a função para transformar a entrada
        // O método 'apply(T t)' executa a transformação definida pela Function.
        // Ele pega a string "teste de tamanho", calcula seu comprimento (16)
        // e retorna o valor Integer 16, que é então impresso.
        IO.println(stringSize.apply("teste de tamanho"));
    }
}
