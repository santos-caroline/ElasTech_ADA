package aula5;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;
import java.io.IOException;

public class exemploHttpClient {
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient(); // cria o cliente HTTP

        HttpRequest request = HttpRequest.newBuilder()                      // constrói a requisição
                .uri(URI.create("https://api.exemplo.com/dados"))           // define o URI da requisição
                .GET()                                                     // método HTTP
                .build();                                                  // finaliza a construção da requisição

        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.printf("Resposta do servidor: %d%n", response.statusCode()); // código de status da resposta
            System.out.println("Corpo da resposta: " + response.body());           // corpo da resposta
        } catch (IOException | InterruptedException e) {
            System.err.println("Erro ao enviar a requisição: " + e.getMessage());
            e.printStackTrace();

            /*
            ✔ HttpClient → busca dados
            ✔ String json = response.body() → recebe JSON
            ✔ ObjectMapper → converte JSON em objeto Java
            ✔ DTO / Model → representa o JSON
            */
        }
    }
}