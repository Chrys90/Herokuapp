package Suporte;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ImagemCommands {

    private static boolean validarDisponibilidadeImagem(String imageUrl) throws IOException, InterruptedException, URISyntaxException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(imageUrl))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        int statusCode = response.statusCode();

        // Verifica se o código de status é 200 (OK)
        return statusCode == 200;
    }

    public static void validarImagem(String imageUrl) {

        try {
            if (validarDisponibilidadeImagem(imageUrl)) {
                System.out.println("A imagem está disponível.");
            } else {
                System.out.println("A imagem está quebrada ou não existe.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao validar a imagem: " + e.getMessage());
        } catch (URISyntaxException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
