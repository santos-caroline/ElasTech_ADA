# Componentes da Comunicação HTTP:

## URL (Uniform Resource Locator) - Localizador Uniforme de Recursos:
- Define o endereço do recurso na web.
- Usando tambem como endereço de API (endpoint).
    ````
    https://api.exemplo.com/usuarios/123
    ````
  
    - **https** é um protocolo com uma segurança maior que o http
    - **hostname** (o nome do servidor): api.exemplo.com
    - **patch** (caminho do recurso): /usuarios/123
    - **query string** (ou string de consulta): parte de uma URL que vem após o ponto de 
  interrogação (?) e contém pares de chave-valor para enviar dados adicionais ao 
  servidor ou filtrar informações, como `?nome=valor&outro=valor2`, usando `&` para
  separar múltiplos parâmetros e `=` para unir a chave ao valor, essencial para filtrar 
  resultados de busca, IDs de usuário ou preferências de página em aplicações web.
  
## URI (Uniform Resource Identifier) - Identificador Uniforme de Recursos:
- Uma sequência de caracteres que identifica um recurso (página web, arquivo, email) na internet,
sendo uma forma mais abrangente de identificação.
- Define que aquele recurso existe em algum lugar.

## URN (Uniform Resource Name) - Nome Uniforme de Recursos:
- Identifica um recurso pelo seu nome único, não pela localização (ex: ISBN de um livro). 
- define alguma coisa na internet ou numa rede específica, não só o endereço.

## Método == ação: 
- Define a ação a ser realizada no recurso.
- Exemplos de métodos HTTP:
    - **GET**: Recuperar dados de um recurso.
    - **POST**: Enviar dados para criar um novo recurso.
    - **PUT**: Atualizar um recurso existente.
    - **DELETE**: Remover um recurso.
    - **PATCH**: Atualizar parcialmente um recurso existente.
    - **HEAD**: Recuperar apenas os cabeçalhos de um recurso.
    - **OPTIONS**: Descobrir quais métodos são suportados por um recurso.
  
## Body (Corpo da Requisição/Resposta):
- Dados a processar ou retornar.
- formato do corpo pode variar (JSON, XML, HTML, texto simples, etc.). 
É definido no cabeçalho "Content-Type".
- Em requisições POST e PUT, o corpo contém os dados a serem enviados ao servidor.
- Em respostas, o corpo contém os dados retornados pelo servidor.
- sempre haverá retorno de body numa resposta, mas nem sempre numa requisição.

## Headers (Cabeçalhos):
- Dados da chamada
- Metadados que fornecem informações adicionais sobre a requisição ou resposta.
- Exemplos de cabeçalhos comuns:
    - **Content-Type**: Tipo de mídia do corpo (ex: application/json).
    - **Authorization**: Credenciais de autenticação.
    - **User-Agent**: Informações sobre o cliente que está a fazer a requisição.
    - **Accept**: Tipos de mídia que o cliente aceita.
    - **Cache-Control**: Diretivas de cache para a requisição ou resposta.
    - **Host**: Nome do host e porta do servidor ao qual a requisição está a ser enviada.
    - **Cookie**: Dados de cookies enviados pelo cliente ao servidor.
    - **Set-Cookie**: Dados de cookies enviados pelo servidor ao cliente.