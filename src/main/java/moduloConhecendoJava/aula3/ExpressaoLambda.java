package Elas_Tech_ADA.mod1;
import java.util.List;
import java.util.Arrays;

public class ExpressaoLambda {

    public static void main(String[] args) {

        // Definição da Expressão Lambda para a operação de soma.
        // O compilador sabe que (a,b) são os parâmetros do método 'calcular'
        // na interface 'Operacao' e que 'a+b' é o valor de retorno.

        Operacao soma = (a,b) -> a+b;
        // Execução da função implementada pela Lambda.
        // Isso executa a lógica 'a+b' com os valores 5 e 3.
        IO.println(soma.calcular(5,3));

        List<String> nomes =
            Arrays.asList("Henrique", "Manu", "Coelho");

        // Utilização do método forEach (introduzido no Java 8).
        // Ele recebe uma Expressão Lambda como argumento.
        // 'nome -> IO.println(nome)' diz: para cada elemento ('nome')
        // da lista, execute a ação de imprimir ('IO.println(nome)').
        
        nomes.forEach(nome -> IO.println(nome));
    }
}