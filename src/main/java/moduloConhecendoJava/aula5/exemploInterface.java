package aula5;
// Define o pacote onde essa interface está organizada

public interface exemploInterface {
    // Declara uma interface
    // Interfaces definem CONTRATOS que classes devem seguir

    default void metodoDefault() {
        // Método DEFAULT:
        // - Pode ter implementação dentro da interface
        // - Classes que implementam a interface NÃO são obrigadas a sobrescrevê-lo

        System.out.println("Este é um método default na interface.");
        // Imprime uma mensagem no console

        auxiliarPrivado();
        // Chama um método privado da interface
    }

    private void auxiliarPrivado() {
        // Método PRIVADO da interface
        // - Só pode ser usado DENTRO da própria interface
        // - Serve como método auxiliar
        // - NÃO pode ser chamado pela classe que implementa a interface

        System.out.println("Este é um método privado auxiliar na interface.");
    }

    class TesteInterface implements exemploInterface {
        // Classe interna à interface
        // Implementa a interface exemploInterface

        public static void main(String[] args) {
            // Método principal (ponto de entrada do programa)

            TesteInterface teste = new TesteInterface();
            // Cria um objeto da classe TesteInterface

            teste.metodoDefault();
            // Chama o método default da interface
            // Esse método, por sua vez, chama o método privado auxiliar
        }
    }
}
