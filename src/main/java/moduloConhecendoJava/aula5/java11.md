# Inferência de Tipos com var em Java 11
## Características: 

- O tipo da variavel é inferido pelo compilador com base no valor inicial.
- O tipo de variável não pode ser alterado após a atribuição inicial.
- A tipagem é feita em tempo de compilação, garantindo segurança, como tipos explícitos.

## Métodos Fábrica para Coleções:
- List.of() - Cria uma lista *imutável*.
- Set.of() - Cria um conjunto *imutável*.
- Map.of() - Cria um mapa *imutável*.

## Cliente HTTP/2:
### Características:
- Suporta HTTP/2 para melhorar a eficiência da rede.
- Permite chamadas síncronas e assíncronas.
- API baseada em Builder Pattern (estilo fluente)

## Métodos privados em Interfaces:
- Com a chegada do Java 11, as ‘interfaces’ passaram a permitir métodos privados.
- Esses métodos privados são uteis para refatorar código repetitivo nas implementações de métodos default.