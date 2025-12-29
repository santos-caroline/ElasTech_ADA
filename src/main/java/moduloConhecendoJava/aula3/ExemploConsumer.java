package Elas_Tech_ADA.mod1;
import java.util.function.Consumer;

public class ExemploConsumer {

public static void main(String[] args){
        // 1. Declaração e Inicialização de um Consumer<String>
        // Consumer é uma interface funcional do pacote java.util.function.
        // Ela representa uma operação que aceita um único argumento de entrada (tipo String)
        // e não retorna nenhum resultado (é uma função void).
        //
        // A expressão lambda 'nome -> IO.println(nome)' implementa o método 'accept' do Consumer.
        // Ela recebe uma string chamada 'nome' e a imprime.
        Consumer<String> imprimiNome =
            nome -> IO.println(nome);

        // 2. Executando a operação definida pelo Consumer
        // O método 'accept(T t)' do Consumer executa a ação definida (a lambda) com o argumento fornecido.
        // Neste caso, ele chama IO.println("Caroline"), imprimindo a string no console.
        imprimiNome.accept("Caroline");
    }
}
