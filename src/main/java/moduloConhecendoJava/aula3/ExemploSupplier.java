package Elas_Tech_ADA.mod1;
import java.util.function.Supplier;

public class ExemploSupplier {

public static void main(String[] args){
        // 1. Declaração e Inicialização de um Supplier<String>
        // Supplier é uma interface funcional do pacote java.util.function.
        // Ela representa um "fornecedor" de resultados, ou seja, uma operação que não recebe
        // nenhum argumento de entrada, mas retorna um resultado do tipo especificado (String).
        //
        // A expressão lambda '() -> "Programando em java"' implementa o método 'get'.
        // Os parênteses vazios '()' indicam que não há parâmetros de entrada.
        // O corpo da lambda retorna a String literal "Programando em java".
        Supplier<String> fornecedor =
            () -> "Programando em java";

        // 2. Obtendo o valor fornecido pelo Supplier
        // O método 'get()' do Supplier executa a operação definida (a lambda)
        // e retorna o resultado.
        // Neste caso, ele retorna a string "Programando em java", que é então impressa.
        IO.println(fornecedor.get());
    }
}
