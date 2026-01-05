# Alterando dados com métodos POST, PUT e DELETE

## POST (INSERIR DADOS):

```
    POST             /pedidos HTTP 1.1
    Host:           api.empresay.com.br
    Content-Type:   application/json    //precisa ter para definir o tipo de conteúdo necessário
    Authorization:  1234
    Accept:         application/json
    
    {               //corpo da requisição o que quero gravar (formato json)
        "itens": [
        {"item":"banana", "qunatidade": 10, "tipo_quantidade": "unidade"},
        {"item":"presunto", "qunatidade": 1.6, "tipo_quantidade": "quilo"}
    }
```
- nesse caso: será feito um post na rota pedidos, com conteudo json. No header vai à autorização, identificando quem 
está a chamar o endpoint. 
- Framework abstrai a chamada

-Retorno:
```
    HTTP/1.1 201 Created
    
 Data: sun, 10 December 2022, 11:12:13 GMT
 Content-Type:   application/json
 Content-length: 132
 Last-Modified: sun, 10 December 2022, 11:12:13 GMT
 
 {
    "status": "ok", "pedido" : {
        "identificacao": 3843,
        "recebido": true,
        "data_entrega": "2022/12/23"
        }
 }

```
- Status **201** == gravado


## PUT( ALTERAR DADOS):
```
    Put             /pedidos HTTP 1.1
    Host:           api.empresay.com.br
    Content-Type:   application/json    
    Authorization:  1234
    Accept:         application/json
    
    {               //LISTA DE ALTERAÇÃO - SE VAI SER A LISTA COMPLETA OU SÓ AS ALTERAÇÕES DEPENDE DO DESENHO DA API
                   //definido e explicado na documentação da API
        "itens": [
        {"item":"banana", "qunatidade": 10, "tipo_quantidade": "unidade"},
        {"item":"presunto", "qunatidade": 1.6, "tipo_quantidade": "quilo"}
    }
```
-Retorno:
```
    HTTP/1.1 200 OK
    
 Data: sun, 10 December 2022, 11:12:13 GMT
 Content-Type:   application/json
 Content-length: 41
 Last-Modified: sun, 10 December 2022, 11:12:13 GMT
 
 {
    "status": "ok", 
 }

```
- Status **200** == ok


## DELETE( REMOVER RECURSO):
```
    DELETE          clientes/12 HTTP 1.1    //depois do delete já passo o recurso que vai ser deletado
    Host:           api.empresay.com.br
    Authorization:  1234
    Accept:         application/json

```
- DELETE é uma **operação atômica**, ou seja, ela acontece de forma única do começo ao fim apagando tudo que é 
necessário e, portanto, **não precisa de um corpo** de especificações.


- Retorno:
```
    HTTP/1.1 200 OK
    
 Data: sun, 10 December 2022, 11:12:13 GMT
 Content-Type:   application/json
 Content-length: 36
 Last-Modified: sun, 10 December 2022, 11:12:13 GMT
 
 {
    "status": "ok", 
 }

```

