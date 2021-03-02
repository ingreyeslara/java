
package jueves24;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jueves24 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Carrera_QNAME = new QName("http://jueves24/", "carrera");
    private final static QName _AlumnoResponse_QNAME = new QName("http://jueves24/", "alumnoResponse");
    private final static QName _Alumno_QNAME = new QName("http://jueves24/", "alumno");
    private final static QName _Universidad_QNAME = new QName("http://jueves24/", "universidad");
    private final static QName _AlturaResponse_QNAME = new QName("http://jueves24/", "alturaResponse");
    private final static QName _Altura_QNAME = new QName("http://jueves24/", "altura");
    private final static QName _UniversidadResponse_QNAME = new QName("http://jueves24/", "universidadResponse");
    private final static QName _CalcularEdad_QNAME = new QName("http://jueves24/", "calcular_edad");
    private final static QName _CalcularEdadResponse_QNAME = new QName("http://jueves24/", "calcular_edadResponse");
    private final static QName _CarreraResponse_QNAME = new QName("http://jueves24/", "carreraResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jueves24
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularEdadResponse }
     * 
     */
    public CalcularEdadResponse createCalcularEdadResponse() {
        return new CalcularEdadResponse();
    }

    /**
     * Create an instance of {@link CarreraResponse }
     * 
     */
    public CarreraResponse createCarreraResponse() {
        return new CarreraResponse();
    }

    /**
     * Create an instance of {@link AlturaResponse }
     * 
     */
    public AlturaResponse createAlturaResponse() {
        return new AlturaResponse();
    }

    /**
     * Create an instance of {@link Altura }
     * 
     */
    public Altura createAltura() {
        return new Altura();
    }

    /**
     * Create an instance of {@link UniversidadResponse }
     * 
     */
    public UniversidadResponse createUniversidadResponse() {
        return new UniversidadResponse();
    }

    /**
     * Create an instance of {@link CalcularEdad }
     * 
     */
    public CalcularEdad createCalcularEdad() {
        return new CalcularEdad();
    }

    /**
     * Create an instance of {@link AlumnoResponse }
     * 
     */
    public AlumnoResponse createAlumnoResponse() {
        return new AlumnoResponse();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link Universidad }
     * 
     */
    public Universidad createUniversidad() {
        return new Universidad();
    }

    /**
     * Create an instance of {@link Carrera }
     * 
     */
    public Carrera createCarrera() {
        return new Carrera();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Carrera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "carrera")
    public JAXBElement<Carrera> createCarrera(Carrera value) {
        return new JAXBElement<Carrera>(_Carrera_QNAME, Carrera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "alumnoResponse")
    public JAXBElement<AlumnoResponse> createAlumnoResponse(AlumnoResponse value) {
        return new JAXBElement<AlumnoResponse>(_AlumnoResponse_QNAME, AlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "alumno")
    public JAXBElement<Alumno> createAlumno(Alumno value) {
        return new JAXBElement<Alumno>(_Alumno_QNAME, Alumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Universidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "universidad")
    public JAXBElement<Universidad> createUniversidad(Universidad value) {
        return new JAXBElement<Universidad>(_Universidad_QNAME, Universidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlturaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "alturaResponse")
    public JAXBElement<AlturaResponse> createAlturaResponse(AlturaResponse value) {
        return new JAXBElement<AlturaResponse>(_AlturaResponse_QNAME, AlturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Altura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "altura")
    public JAXBElement<Altura> createAltura(Altura value) {
        return new JAXBElement<Altura>(_Altura_QNAME, Altura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniversidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "universidadResponse")
    public JAXBElement<UniversidadResponse> createUniversidadResponse(UniversidadResponse value) {
        return new JAXBElement<UniversidadResponse>(_UniversidadResponse_QNAME, UniversidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularEdad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "calcular_edad")
    public JAXBElement<CalcularEdad> createCalcularEdad(CalcularEdad value) {
        return new JAXBElement<CalcularEdad>(_CalcularEdad_QNAME, CalcularEdad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularEdadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "calcular_edadResponse")
    public JAXBElement<CalcularEdadResponse> createCalcularEdadResponse(CalcularEdadResponse value) {
        return new JAXBElement<CalcularEdadResponse>(_CalcularEdadResponse_QNAME, CalcularEdadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarreraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jueves24/", name = "carreraResponse")
    public JAXBElement<CarreraResponse> createCarreraResponse(CarreraResponse value) {
        return new JAXBElement<CarreraResponse>(_CarreraResponse_QNAME, CarreraResponse.class, null, value);
    }

}
