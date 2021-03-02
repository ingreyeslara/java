
package jueves24;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calcular_edad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calcular_edad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha_actual" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcular_edad", propOrder = {
    "fechaNacimiento",
    "fechaActual"
})
public class CalcularEdad {

    @XmlElement(name = "fecha_nacimiento")
    protected int fechaNacimiento;
    @XmlElement(name = "fecha_actual")
    protected int fechaActual;

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     */
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     */
    public void setFechaNacimiento(int value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActual.
     * 
     */
    public int getFechaActual() {
        return fechaActual;
    }

    /**
     * Define el valor de la propiedad fechaActual.
     * 
     */
    public void setFechaActual(int value) {
        this.fechaActual = value;
    }

}
