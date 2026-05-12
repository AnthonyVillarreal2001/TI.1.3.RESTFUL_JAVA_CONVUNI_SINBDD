package ec.edu.monster.controller;

import ec.edu.monster.model.ConversionType;
import ec.edu.monster.rsclient.RestConversionClient;

public class ConversionController {

    private final RestConversionClient port;

    public ConversionController() {
        this.port = new RestConversionClient();
    }

    public float convertir(ConversionType tipo, float valor) {
        switch (tipo) {
            case CM_A_IN: return port.centimetrosAPulgadas(valor);
            case IN_A_CM: return port.pulgadasACentimetros(valor);
            case C_A_F:   return port.celsiusAFahrenheit(valor);
            case F_A_C:   return port.fahrenheitACelsius(valor);
            case KG_A_LB: return port.kilogramosALibras(valor);
            case LB_A_KG: return port.librasAKilogramos(valor);
            default: throw new IllegalArgumentException("Tipo no soportado");
        }
    }
}
