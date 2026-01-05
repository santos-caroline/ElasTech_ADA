# Métodos de acesso e Método GET

```
 **Requisição**
 
 GET /clientes/12  HTTP 1.1      //chamada GET e rota(/clientes/12)
 Host: api.empresay.com.br      //host é o nome do servidor
 Authorization: 1234            //aonde é informado o token de autorização   (texto criptografado de identificação)
 Accept: application/json       //definir o formato de resposta 
 
 **Resposta**
 
 HTTP/1.1 200 ok   //200 é código de status do que aconteceu com a chamada
 
 Data: sun, 10 December 2022, 11:12:13 GMT
 Content-length: 36
 Last-Modified: sun, 10 December 2022, 11:12:13 GMT
 
 {"nome": "Empresa Doze", "id": 12, "responsavel": "Jose Silva"}  //retorno

```
- No uso de framework as chamadas (requisições) de API são geradas automaticamente


## Métodos >>> padrão REST
- GET (Obter) 
- PUT / PATCH (Efetuar alteração) - "no corpo da requisição informamos quais dados vão ser alterados"
- POST (criar) 
- DELETE (excluir)
- OPTIONS (definir configurações de acesso às chamadas)


  - Exemplo: "precisamos alterar os dados de um cliente"
    -  uso **GET** para pegar os dados completos e alterar o necessário, depois envio com o **PUT**
         - GET recebe os dados completos e PUT envia completo novamente.
  

### 1. GET >>> usado para obter dados
- "a gente faz o GET e passa os cabeçalhos"
  - estamos pedindo algo para o servidor: no exemplo do começo, estamos pedindo o recurso **12**
- No GET não é enviada informações no corpo porque o GET é só para **obtenção de dados**
- O que va ser retornado? Os headers, o formato dele, quando foi alterado pela última vez e também o conteudo pedido
no formado desejado