# Arquitetura de uma API:
- "Arquitetura é processo de análise de requisitos e restrições e a criação de uma solução que atende os requisitos
e está dentro das restrições "


- construir uma arquitetura == "como vamos construir algo dentro das restrições colocadas"


- arquitetura - como vamos resolver o problema


- **API É UMA INTERFACE**, fica do lado do servidor e, portanto, deve sempre pensar em atender a chamada do cliente
e como esse dado vai retornar. API também tem a função de **encapsulamento da regra de négocio**. O cliente não acessa
essas informações.


- A ideia da interface é receber o pedido, receber os dados, processar e devolver com o mínimo de exposição das regras
internas. Tipo de dados com retorno comum (exemplo JSON). Além disso, é importante trabalhar com **cliente autenticado**
, então no cabeçalho de autorização deve ter as informações bem formatadas, que seja interpretada tanto pelo cliente
quanto pelo servidor.


## O bom funcionamento de uma API:
- Analise prévia de alguns pontos:
  -    Quais recursos serão disponibilizados, ou qual parte deles (restrições de acesso de informações faz parte do 
desenho da API).
  -  Quais dados serão entregues e em qual formato (exemplo: JSON para cliente em servidores web).
  - Como a segurança será implementada, pensando na segurança dos dados(quem pode acessar os dados e quais dados cada
  pessoa pode acessar)
  - Entender a velocidade de retorno dos dados (desempenho esperado ou latência de retorno)
 

- A interface é para entregar os dados ao cliente no formato que ele precisa, portanto deve atender o máximo de clientes
conforme o necessário.

## Servidor:
- o computador onde a api está a rodar, sendo o dimensionamento do servidor parte do desenho da arquitetura
  - Precisa levar em consideração >>> "quantos acessos serão feitos", "qual o tempo esperado", >>> infraestrutura (devOps)
    - o servidor que vai atender a requisição
    - devOps >>> trabalho de estruturação, de mensuração e do dimensionamento do servidor

## Estrutura rotas:
- Precisa ser coesa e bem estruturada
- é aonde vamos encontrar os dados (exemplo: lista de pedidos, usuarios, etc.)
- uma rota vai definir, com método de acesso, o que o cliente precisa fazer.