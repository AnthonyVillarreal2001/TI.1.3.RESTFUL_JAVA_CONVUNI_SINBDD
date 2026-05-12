package ec.edu.monster.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.util.concurrent.TimeUnit;

public class RestClient {

    private static final String BASE_URL = "http://10.0.2.2:8080/WS_ConUni_RESTFULLJAVA_GR08/api/conversion/";

    private static final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build();

    /**
     * Realiza una llamada REST al servicio web de conversión de unidades
     * @param path Ruta del endpoint REST (ej. "cm-a-in")
     * @param value Valor a convertir
     * @return Resultado de la conversión
     * @throws Exception Si hay algún error en la comunicación
     */
    public static float callConversion(String path, float value) throws Exception {
        String url = BASE_URL + path + "?valor=" + value;

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new Exception("Error HTTP: " + response.code() + " " + response.message());
            }

            String responseBody = response.body().string();
            return Float.parseFloat(responseBody);
        } catch (NumberFormatException e) {
            throw new Exception("Error al procesar la respuesta: no es un número válido.");
        }
    }
}
