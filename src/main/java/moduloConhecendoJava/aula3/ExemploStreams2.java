package Elas_Tech_ADA.mod1;

import java.util.List;

public class ExemploStreams2 {

    public static void main(String[] args) {
        // 1. Definição da Fonte de Dados
        List<Integer> num = List.of(
                1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 // Lista imutável de números (Collection)
        );

        List<Integer> result = num.stream()
                .map(n -> {

                    /*
                    O que faz o map()?
                    é uma operação intermediária em streams que transforma cada elemento da lista original
                    em um novo elemento. Ele aplica uma função a cada item e retorna um novo stream com os
                    resultados.map()
                    */

                    if (n % 2 == 0) {
                        return (n * n) +1;
                    }else {
                        return n * n;
                    }
               }) .toList();

        result.forEach(System.out::println);

        System.out.println(result.stream()
                .filter(it -> it % 2 != 0) //conta os num ímpares
                .count());

        System.out.println("Max: " +
                result.stream().max(Integer::compareTo).get());
        System.out.println("Min: " +
                result.stream().min(Integer::compareTo).get());
    }
}