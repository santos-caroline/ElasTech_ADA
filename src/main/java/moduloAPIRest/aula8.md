# Status Code, Autenticação e Cookies
- Respostas são tratadas pelo cliente não só pelo conteúdo do corpo, mas também pelo status code.
  - se houver erros, saber se o erro veio do lado do cliente ou do servidor


## STATUS CODE:
- Organizados em classes:
  - **2xx** (código de sucesso)
  - **3xx** (redirecionamento)
  - **4xx** (Erros de cliente)
  - **5xx** (Erros de servidor)

## Header AUTHORIZATION

```
    Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6...OkÿJV_adQssw5c
```
- Informar ao servidor quem está a acessar aquela informação
  - precisa ser informado em chamadas restritas
  - informações de clientes de forma criptografada, podendo ser de acordo com uma chave que o cliente e o servidor 
compartilham ou de forma de um **hash de acesso** que os dois sabem quais os dados e como intepretar os dados
    - EXEMPLO: existem APIs que entregam endpoint GET para o cliente obter um hash com um valor de autorização e 
    o cliente usa esse valor para retornar dali para frente um header de autorização
    - formato JWT é muito usado nesse tipo de comunicação
      - permite ao cliente o tráfico de dados, com validação de fora segura, e o trafego de dados ocorre de maneira 
      simples, pois a criptografia já está pré-definida. Já se sabe quem tem as chaves, como criar, como validar os 
      dados
        
## Cookies
- Trafegar dados entre cliente e servidor
- cookies == informações que ficam gravadas no cliente e toda chamada feita ao servidor esses dados serão informados
  -servidor também pode enviar cookies ao cliente sem que seja solicitado, e esses cookies são usualmente armazenados 
pelo cliente e depois enviadas novamente ao servidor (exemplo: identificação de sessão)

- Formato:
```
    Cookie: LastVisit=20220919;preferences=nosave,nolog;sid=YWRhbWVsaG9yZXNjb2xhCg=
```

- Campos disponíveis:
```
    LastVisit=20220919
    preferences=nosave,nolog
    sid=YWRhbWVsaG9yZXNjb2xhCg=
```

- Desse modo, é possível estabelecer uma conexão que deveria ser sem estado (HTTP) de uma forma que mantém o estado, 
mas sempre sem manter uma conexão consistente, ou seja, que demore muito tempo entre o servidor e o cliente.