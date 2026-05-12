package ec.edu.monster.rsclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RestConversionClient {

    private static final String REST_ENDPOINT = "http://localhost:8080/WS_ConUni_RESTFULLJAVA_GR08/api/conversion/";

    private final HttpClient httpClient;

    public RestConversionClient() {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build();
    }

    private float callApi(String path, float valor) {
        try {
            String url = REST_ENDPOINT + path + "?valor=" + valor;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofSeconds(10))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return Float.parseFloat(response.body());
            } else {
                throw new RuntimeException("Error HTTP " + response.statusCode() + ": " + response.body());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al llamar a la API REST: " + e.getMessage(), e);
        }
    }

    // ===== Longitud =====
    public float centimetrosAPulgadas(float centimetros) {
        return callApi("cm-a-in", centimetros);
    }

    public float pulgadasACentimetros(float pulgadas) {
        return callApi("in-a-cm", pulgadas);
    }

    // ===== Temperatura =====
    public float celsiusAFahrenheit(float celsius) {
        return callApi("c-a-f", celsius);
    }

    public float fahrenheitACelsius(float fahrenheit) {
        return callApi("f-a-c", fahrenheit);
    }

    // ===== Masa =====
    public float kilogramosALibras(float kilogramos) {
        return callApi("kg-a-lb", kilogramos);
    }

    public float librasAKilogramos(float libras) {
        return callApi("lb-a-kg", libras);
    }
}
