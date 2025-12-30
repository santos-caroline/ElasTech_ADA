package moduloConhecendoJava.aula6;

public class exemploPatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello, Pattern Matching!";

        // Usando pattern matching com instanceof
        if (obj instanceof String str) { // Aqui 'str' é a variável de padrão
            System.out.println("A string tem comprimento: " + str.length());
        } else {
            System.out.println("O objeto não é uma string.");
        }
    }
}
