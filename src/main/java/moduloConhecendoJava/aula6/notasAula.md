# JAVA 17 I

## String Block, Switch Expression e Pattern Matching

- Text Blocks (Blocos de Texto)
    
  - Facilidade na criação de Strings longas, como textos de SQL,
    JSON ou HTML.
   - Permitem criar strings multilinha de forma mais legível.
  - Sintaxe: Utiliza três aspas duplas (`"""`) para delimitar
  o bloco de texto.
  
  <br>
  
  - Exemplo:
    ```java
    String json = """
                  {
                      "nome": "João",
                      "idade": 30,
                      "cidade": "São Paulo"
                  }
                  """;
    ```

- Switch Expression (Expressão Switch):
    -Switch pode ser usado como uma expressão que retorna um valor,
em vez de apenas como uma declaração.
Isso elimina a necessidade de usar variaveis auxiliares.
    - Sintaxe: Utiliza a palavra-chave `yield` para retornar valores.
    
    <br>
    
    - Exemplo:
    ```java
    int diaDaSemana = 3;
    String nomeDoDia = switch (diaDaSemana) {
        case 1 -> "Domingo";
        case 2 -> "Segunda-feira";
        case 3 -> "Terça-feira";
        case 4 -> "Quarta-feira";
        case 5 -> "Quinta-feira";
        case 6 -> "Sexta-feira";
        case 7 -> "Sábado";
        default -> "Dia inválido";
    };
    ```
  
- Pattern Matching para instanceof:
    - Com o Pattern Matching, podemos testar e fazer cast de objetos de maneira mais
eficiente e com menos código.
    - Simplifica o uso do operador `instanceof` ao permitir
a verificação e o cast numa única operação.
    - Sintaxe: Após verificar o tipo com `instanceof`, você pode
usar a variável diretamente.
    
    <br>
    
    - Exemplo:
    ```java
    Object obj = "Olá, Mundo!";
  
    if (obj instanceof String s) {
        // 's' já é do tipo String aqui dentro
        System.out.println("A string é: " + s);
    }
    ```
  - Como funciona na prática:

    <br>

       - **Predicado**: O obj instanceof String verifica se o objeto é uma instância da classe. 
     - **Variável** de Padrão: O s é a variável que será criada automaticamente.
     - **Escopo**: A variável s só está no escopo onde o compilador tem certeza de que o tipo
  está correto.

    <br>


- Regras de Escopo (Scope Flow): Uma característica inteligente dessa funcionalidade é 
o "flow scoping". A variável só existe onde o instanceof é verdadeiro.
  
