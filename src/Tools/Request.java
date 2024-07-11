package Tools;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    public int Valor (String codigo){ //se envía por medio de la clase la solicitud de un tipo de cambio

        int cambio = 0;

        String ruta = "https://v6.exchangerate-api.com/v6/4c794d315ad5c0a59ebd83bd/latest/"+codigo; //se agregar a la ruta el tipo de cambio para realizar la solicitud

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ruta))
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());



        }catch (Exception e){

            throw new RuntimeException("El tipo de cambio no es valido.");
        }


        return cambio;

    }
}
