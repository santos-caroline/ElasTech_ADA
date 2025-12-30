# JAVA 17 II

## Record:
- **Imutabilidade**: um record é uma classe final com todos os seus
atributos também final. '

- **Sintaxe Concisa**: O compilador gera automaticamente o construtor 
canônico, método `equals()`, `hashCode()`, e `toString()`.

- **Acessadores**: Os metodos para acessar os atributos são gerados 
automaticamente

- **Facilidades**: Você **não precisa escrever o código** repetivivo,
como getters, setters,
`equals()`, `hashCode()`, e `toString()`.

  Exemplo de Record:
  ```java
  public record Pessoa(String nome, int idade) {}
  ```

## Sealed Class:
- As **sealed classes** permitem controlar explicitamente quais classes
podem estender uma classe base. Uma Sealed Class permite definir um 
conjunto restrito de subclasses, oferecendo um controle mais rigoroso
sobre a hierarquia de tipos.
- 'Classes seladas' não podem ser herdadas ou extendidas livremente


  Exemplo de Sealed Class:
  ```java
    public sealed class Forma permits Circulo, Retangulo {
        // Corpo da classe
    }
  
  ```
<br> 


**Dica final:** Se você está a lidar com dados imutáveis ou estruturas que exigem um controle
rigoroso sobre a herança, os Records e Sealed Classes são ferramentas poderosas que simplificam
e tornam o código mais seguro e legível.