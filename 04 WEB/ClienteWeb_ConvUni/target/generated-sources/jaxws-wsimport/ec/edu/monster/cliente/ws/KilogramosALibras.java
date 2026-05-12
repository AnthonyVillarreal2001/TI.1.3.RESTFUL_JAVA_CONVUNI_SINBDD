
package ec.edu.monster.cliente.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para kilogramosALibras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="kilogramosALibras">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kilogramos" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
