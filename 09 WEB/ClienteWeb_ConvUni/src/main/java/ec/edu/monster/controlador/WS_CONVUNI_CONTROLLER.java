package ec.edu.monster.controlador;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class WS_CONVUNI_CONTROLLER {

    private static final String REST_ENDPOINT = "http://localhost:8080/WS_ConUni_RESTFULLJAVA_GR08/api/conversion/";
    private final HttpClient httpClient;

    public WS_CONVUNI_CONTROLLER() {
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

    public float convertirCentimetrosAPulgadas(float cm) {
        return callApi("cm-a-in", cm);
    }

    public float convertirPulgadasACentimetros(float in) {
        return callApi("in-a-cm", in);
    }

    public float convertirCelsiusAFahrenheit(float c) {
        return callApi("c-a-f", c);
    }

    public float convertirFahrenheitACelsius(float f) {
        return callApi("f-a-c", f);
    }

    public float convertirKilogramosALibras(float kg) {
        return callApi("kg-a-lb", kg);
    }

    public float convertirLibrasAKilogramos(float lb) {
        return callApi("lb-a-kg", lb);
    }
}