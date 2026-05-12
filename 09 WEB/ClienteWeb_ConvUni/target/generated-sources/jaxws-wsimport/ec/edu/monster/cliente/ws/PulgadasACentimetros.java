
package ec.edu.monster.cliente.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pulgadasACentimetros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="pulgadasACentimetros">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pulgadas" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
