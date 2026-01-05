# Trabalhando com clientes móveis e navegadores

- uso de API HTTP aumentou com exponencialmente a partir do surgimento dos **clientes web** (clientes de navegador, 
frontends desconectados do backend usando framework - react, etc e aplicações móveis)


- Todas essas aplicações, sejam móveis ou web, trabalham sobre HTTP. A estrutura interna permite que se façam diversas 
**chamadas simultâneas** a diferentes serviços dentro de um servidor, então ao invés de chamar uma única vez uma API para 
obter dados de um pedido, o que é feito, são pedidos paralelos simultaneos chamados **assincronia**


  - servidor trata essas chamadas forma única, pois o servidor trabalha com chamadas de forma desconectadas conforme
  definido no protocolo HTTP


  - JSON é condiderado a lingua franca (tanto para o front como pro backend)


  - atualmente temos um crescente uso de recursos do celular e, portanto, mais chamadas em API. Assim, as API do lado 
  do backend tem que estar preparada para entregar todas as chamadas rapidamente (em grandes quantidades) 
  simultaneamente e assim evitar problemas como o time out (onde o cliente fica a esperar a resposta até perceber que 
  não haverá retorno e ele mesmo corta a chamada).


  - o gerenciamento da sessão deve ser feito de forma segura, sendo assim, não pode acontecer de armazenar (exemplo 
via cookies) dados abertos ou não criptografados
    - exemplo: lei de LGPD
    - segurança precisa funcionar do lado do cliente e do lado do servidor
    - o gerenciamento da sessão é compartilhado entre o cliente e o servidor, seja por cookies ou validando a sessão

## Como um Browser faz uma chamada de API?


- Um browser carrega a página e vai exibir a página para o cliente (carregando todo o código para o computador e 
rodando em seguida). Para isso são necessárias várias chamadas e entender quais são as novas chamadas e como fazer 
essas chamadas. Internamente, o browser vai criar instâncias de requisições para ele gerir. 
  - javascript pede pro browser, o browser retorna e entrega a chamada pro javascript
  - se a página faz uma grande quantidade de chamadas a API, ela sobrecarrega o browser (e consequentemente 
  o processamento da máquina)
    - o cliente fica lento e prejudica o desempenho do computador
