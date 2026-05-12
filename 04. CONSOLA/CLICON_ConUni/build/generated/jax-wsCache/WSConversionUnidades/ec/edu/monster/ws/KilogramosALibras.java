
package ec.edu.monster.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para kilogramosALibras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="kilogramosALibras"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kilogramos" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kilogramosALibras", propOrder = {
    "kilogramos"
})
public class KilogramosALibras {

    protected float kilogramos;

    /**
     * Obtiene el valor de la propiedad kilogramos.
     * 
     */
    public float getKilogramos() {
        return kilogramos;
    }

    /**
     * Define el valor de la propiedad kilogramos.
     * 
     */
    public void setKilogramos(float value) {
        this.kilogramos = value;
    }

}
