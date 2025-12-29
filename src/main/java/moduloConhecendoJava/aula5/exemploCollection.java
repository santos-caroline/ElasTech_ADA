package aula5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class exemploCollection {
    public static void  main(String[] args) {

        //lista imutável:
        List<String> lista = List.of("Elemento 1", "Elemento 2", "Elemento 3");
        System.out.println(lista);

        //Conjunto imutável:
        Set<Integer> conjunto = Set.of(1, 2, 3, 4, 5);
        System.out.println(conjunto);

        //mapa imutável:
        Map<String, Integer> mapa = Map.of("Chave1", 10, "Chave2", 20, "Chave3", 30);
        System.out.println(mapa);

    }
}
