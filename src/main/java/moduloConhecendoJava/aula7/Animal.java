package moduloConhecendoJava.aula7;

public sealed class Animal permits Cachorro, Gato { // Classe selada
    public void emitirSom() {
        System.out.println("Som de animal");
    }
}

final class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Latido ...");
    }
}

final class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Miado ...");
    }
}