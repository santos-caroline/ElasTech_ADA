# AULA 1 - 0 que são APIs, APIs HTTP e APIs HTTP REST?

## Toda aplicação tem uma interface:
- API (Application Programming Interface) é a interface que permite a comunicação entre diferentes sistemas ou 
componentes de software.
- APIs definem como os desenvolvedores podem interagir com um sistema, quais funcionalidades estão disponíveis
e como os dados podem ser trocados.
- As APIs podem ser usadas para permitir que diferentes aplicações se comuniquem entre si, mesmo que sejam desenvolvidas
em linguagens diferentes ou estejam em plataformas distintas.
- Protocolos comuns para APIs incluem REST, SOAP e GraphQL.

## Protocolo http
- Protocolo http é um conjunto de regras que define como os dados são transmitidos na web.
- APIs HTTP são APIs que utilizam o protocolo HTTP para comunicação entre cliente e servidor.


 A [app móvel] --> C [API HTTP]  <-- B [app web]
 

C --> D [aplicação]

- As APIs HTTP utilizam os métodos HTTP (GET, POST, PUT, DELETE, etc.) para realizar operações sobre recursos
e trocar dados entre o cliente e o servidor.
- regras de acesso, autenticação, formatação de dados (JSON, XML, etc.) e outros aspectos da comunicação.
- Padrão REST (Representational State Transfer) é um estilo arquitetural para projetar APIs HTTP. Cada requisição contém
todas as informações necessárias, e o servidor não armazena o contexto do cliente entre as requisições.
- Como você vai usar e quais a regras que você vai seguir para fazer essa comunicação.

## Como funcionam as APIs REST?
O cliente inicia uma comunicação enviando uma requisição HTTP ao servidor. O servidor recebe a solicitação e processa a
ação usando o método HTTP. Após processar a solicitação, o servidor envia de volta uma resposta HTTP ao cliente. 
O cliente manipula ou exibe os dados e notifica o servidor sobre quaisquer mudanças de estado.
Assim como o HTTP, APIs REST usam métodos para definir o tipo de requisição enviada ao servidor.

- GET: Recupera a entrada de dados em um determinado endpoint.

- POST: Cria uma nova entrada de dados no banco de dados.

- PUT: Atualiza um dado existente completamente.

- PATCH: Atualizações fazem parte de uma entrada de dados.

- DELETE: Apaga uma entrada de dados.

### Qual é a principal diferença entre APIs HTTP e APIs REST?
- Uma API HTTP usa protocolos HTTP para comunicação, enquanto uma API REST é um tipo de API HTTP que adere às restrições
arquiteturais REST, como a falta de estado e uma interface uniforme.
