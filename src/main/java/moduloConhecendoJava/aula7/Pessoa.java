package moduloConhecendoJava.aula7;

//Exemplo de Record:

public record Pessoa(String nome, int idade) { // Construtor primário é gerado automaticamente
    public Pessoa(String nome) {              // Construtor secundário
        this(nome, 32);               // Idade padrão
    }

}
