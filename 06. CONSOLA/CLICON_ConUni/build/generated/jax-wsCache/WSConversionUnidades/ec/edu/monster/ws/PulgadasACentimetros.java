
package ec.edu.monster.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pulgadasACentimetros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pulgadasACentimetros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pulgadas" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pulgadasACentimetros", propOrder = {
    "pulgadas"
})
public class PulgadasACentimetros {

    protected float pulgadas;

    /**
     * Obtiene el valor de la propiedad pulgadas.
     * 
     */
    public float getPulgadas() {
        return pulgadas;
    }

    /**
     * Define el valor de la propiedad pulgadas.
     * 
     */
    public void setPulgadas(float value) {
        this.pulgadas = value;
    }

}
