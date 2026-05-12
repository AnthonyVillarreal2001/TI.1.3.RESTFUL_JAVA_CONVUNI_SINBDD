
package ec.edu.monster.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para celsiusAFahrenheit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="celsiusAFahrenheit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="celsius" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "celsiusAFahrenheit", propOrder = {
    "celsius"
})
public class CelsiusAFahrenheit {

    protected float celsius;

    /**
     * Obtiene el valor de la propiedad celsius.
     * 
     */
    public float getCelsius() {
        return celsius;
    }

    /**
     * Define el valor de la propiedad celsius.
     * 
     */
    public void setCelsius(float value) {
        this.celsius = value;
    }

}
