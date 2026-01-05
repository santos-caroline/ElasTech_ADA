# O que é REST?
- REST (Representational State Transfer): estilo de arquitetura de API, ou seja, um conjunto de ideias que vão definir
como um recurso vai ser acessado na rede.


- Regras do padrão REST: 
  - definir como que um recurso tem que ser identificado;
  - como que o recurso tem que ser acessado
  - como que ele tem que ser disponibilizado
  

- APIs HTTP >>> formato da URL define como os recursos devem ser acessados:
    - definir os recursos e em cima dos recursos (usando o protocolo http) definir as regras de acesso das informações
    - Exemplo de padronização REST >>> padronização de rotas (antes rotas de endpoint eram caóticas, com o REST seguimos
  uma padronização).
  - validações vão no header
      - cada endereço é um recurso
      
      
```
Recurso (https:// api.empresay.com.br/pedidos)

Operação 
    GET (htpps://api.empresay.com.br/pedidos)
    >> obter a lista de pedidos 
    
    POST (htpps://api.empresay.com.br/pedidos)
    >>  registrar um pedido
```

- Todos os dados referentes a chamada ficam no cabeçalho 


- os dados enviados para cada endpoint dentro da API (registros) vão no corpo
  - endpoint == "falo o que quero"
  - método == "qual é a operação que vou fazer nos cabeçalhos"
  - cabeçalho == "quais são os metadados ou configurações / dados sobre a requisição"
  - corpo == "envio / recebo os dados conforme necessidade"


- API desacoplada - faz muito bem um único trabalho; uma chamada para cada ação (exemplo: 1 registrar cliente; 
2 registrar pedido)
    - para relacionar as informações usamos o cabeçalho
    - 