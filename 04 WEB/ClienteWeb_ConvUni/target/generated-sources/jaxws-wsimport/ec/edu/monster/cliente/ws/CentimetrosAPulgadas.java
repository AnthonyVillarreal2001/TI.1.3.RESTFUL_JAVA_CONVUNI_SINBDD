
package ec.edu.monster.cliente.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para centimetrosAPulgadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="centimetrosAPulgadas">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="centimetros" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centimetrosAPulgadas", propOrder = {
    "centimetros"
})
public class CentimetrosAPulgadas {

    protected float centimetros;

    /**
     * Obtiene el valor de la propiedad centimetros.
     * 
     */
    public float getCentimetros() {
        return centimetros;
    }

    /**
     * Define el valor de la propiedad centimetros.
     * 
     */
    public void setCentimetros(float value) {
        this.centimetros = value;
    }

}
