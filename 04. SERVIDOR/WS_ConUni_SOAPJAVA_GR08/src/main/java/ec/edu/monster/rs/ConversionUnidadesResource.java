package ec.edu.monster.rs;

import ec.edu.monster.servicio.ConversionUnidadesServicio;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("conversion")
public class ConversionUnidadesResource {

    private ConversionUnidadesServicio servicio;

    public ConversionUnidadesResource() {
        this.servicio = new ConversionUnidadesServicio();
    }

    // ===== Longitud =====
    @GET
    @Path("cm-a-in")
    @Produces(MediaType.TEXT_PLAIN)
    public float centimetrosAPulgadas(@QueryParam("valor") float centimetros) {
        return servicio.centimetrosAPulgadas(centimetros);
    }

    @GET
    @Path("in-a-cm")
    @Produces(MediaType.TEXT_PLAIN)
    public float pulgadasACentimetros(@QueryParam("valor") float pulgadas) {
        return servicio.pulgadasACentimetros(pulgadas);
    }

    // ===== Temperatura =====
    @GET
    @Path("c-a-f")
    @Produces(MediaType.TEXT_PLAIN)
    public float celsiusAFahrenheit(@QueryParam("valor") float celsius) {
        return servicio.celsiusAFahrenheit(celsius);
    }

    @GET
    @Path("f-a-c")
    @Produces(MediaType.TEXT_PLAIN)
    public float fahrenheitACelsius(@QueryParam("valor") float fahrenheit) {
        return servicio.fahrenheitACelsius(fahrenheit);
    }

    // ===== Masa =====
    @GET
    @Path("kg-a-lb")
    @Produces(MediaType.TEXT_PLAIN)
    public float kilogramosALibras(@QueryParam("valor") float kilogramos) {
        return servicio.kilogramosALibras(kilogramos);
    }

    @GET
    @Path("lb-a-kg")
    @Produces(MediaType.TEXT_PLAIN)
    public float librasAKilogramos(@QueryParam("valor") float libras) {
        return servicio.librasAKilogramos(libras);
    }
}
