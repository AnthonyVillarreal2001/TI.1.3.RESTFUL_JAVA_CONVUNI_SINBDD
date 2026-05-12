
package ec.edu.monster.cliente.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para librasAKilogramos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="librasAKilogramos">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="libras" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librasAKilogramos", propOrder = {
    "libras"
})
public class LibrasAKilogramos {

    protected float libras;

    /**
     * Obtiene el valor de la propiedad libras.
     * 
     */
    public float getLibras() {
        return libras;
    }

    /**
     * Define el valor de la propiedad libras.
     * 
     */
    public void setLibras(float value) {
        this.libras = value;
    }

}
