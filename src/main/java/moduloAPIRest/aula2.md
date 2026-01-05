
# AULA 2 - Comunicação HTTP:

- API - interface
- Protocolo HTTP - regras de comunicação
- Rest - padrão parar definir endpoints e métodos

## Protocolos HTTP: defini como o cliente e o servidor se comunicam
- Conjunto de regras para troca de informações entre sistemas
- Cliente envia uma solicitação para o servidor
- Servidor processa a requisição e envia uma resposta de volta ao cliente
- cliente não fica conectado ao servidor (conexões de tempo limitado)
- Resposta SEMPRE vem do servidor
- Protocolo http é sem estado (stateless): cada requisição é independente e não mantém informações sobre requisições 
anteriores (não guarda informações do cliente - servidor não sabe o contexto da requisição)
- Comunicação baseada em requisições e respostas

## Request (requisição):
- é o pedido que um cliente realiza a nosso servidor.
Esse pedido contém uma série de dados que são usados para descrever exatamente o que o cliente precisa. 
Vamos pensar que um cliente precisa cadastrar um novo produto, ele deve passar todos os dados necessários para o 
cadastro acontecer de maneira correta, inclusive os dados que foram digitados pelo usuário em um formulário, no caso 
de uma aplicação web. No navegador toda vez que trocamos de página ou apertamos enter na barra de endereço uma nova 
request é feita. Independente se estamos apenas pedindo a exibição de uma página, cadastrando um novo recurso,
atualizando ou excluindo.