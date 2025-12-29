package Elas_Tech_ADA.mod1;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class ExemploStreams {

    public static void main(String[] args) {
        // 1. Definição da Fonte de Dados
        List<Integer> num =List.of(
                1,2,3,4,5,5,6,7,8,9,10 // Lista imutável de números (Collection)
        );

        // 2. Criação e Execução do Pipeline Stream
        System.out.println(num.stream() // Inicia a Stream: transforma a lista em um fluxo de dados.

                // 3. Operação Intermediária (retornam stream): Filtragem
                .filter(it -> it % 2 == 0) // Filtra os elementos, mantendo apenas aqueles que são pares (resto da divisão por 2 é zero).

                // 4. Operação Terminal (consomem a stream e geram um resultado) // : Redução (Agregação)
                .reduce(0,Integer::sum)); // Reduz os elementos restantes a um único valor.
        // O '0' é o valor inicial (identidade).
        // 'Integer::sum' é a função de agregação (soma).
    }
}
