package Elas_Tech_ADA.mod1;

import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream3 {

    static void main(String[] args) {
        List<String> nomes =
                List.of("Jose", "Carlos", "Maria", "Ana", "Carlos");
        List<String> nomesFiltrados =
                nomes.stream()
                        .filter(nome -> nome.startsWith("C"))
                        .distinct() //retira os duplicados
                        .collect(Collectors.toList());

        nomes.forEach(System.out::println);
            /*
            :: Referência a Método - Usado em System.out::println para fornecer o método println como a ação a
            ser executada para cada elemento na lista (forEach).
            Essa referência a método é equivalente à seguinte expressão lambda:
            nomes.forEach(nome -> System.out.println(nome));
            */

        var lista = nomes.stream()
                .filter(nome -> nome.contains("o"))
                .collect(Collectors.toSet());

        System.out.println(lista);



    }
}
