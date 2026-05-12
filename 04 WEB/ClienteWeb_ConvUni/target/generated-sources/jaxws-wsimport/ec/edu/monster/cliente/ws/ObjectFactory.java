
package ec.edu.monster.cliente.ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.monster.cliente.ws package. 
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

    private static final QName _CelsiusAFahrenheit_QNAME = new QName("http://ws.monster.edu.ec/", "celsiusAFahrenheit");
    private static final QName _CelsiusAFahrenheitResponse_QNAME = new QName("http://ws.monster.edu.ec/", "celsiusAFahrenheitResponse");
    private static final QName _CentimetrosAPulgadas_QNAME = new QName("http://ws.monster.edu.ec/", "centimetrosAPulgadas");
    private static final QName _CentimetrosAPulgadasResponse_QNAME = new QName("http://ws.monster.edu.ec/", "centimetrosAPulgadasResponse");
    private static final QName _FahrenheitACelsius_QNAME = new QName("http://ws.monster.edu.ec/", "fahrenheitACelsius");
    private static final QName _FahrenheitACelsiusResponse_QNAME = new QName("http://ws.monster.edu.ec/", "fahrenheitACelsiusResponse");
    private static final QName _KilogramosALibras_QNAME = new QName("http://ws.monster.edu.ec/", "kilogramosALibras");
    private static final QName _KilogramosALibrasResponse_QNAME = new QName("http://ws.monster.edu.ec/", "kilogramosALibrasResponse");
    private static final QName _LibrasAKilogramos_QNAME = new QName("http://ws.monster.edu.ec/", "librasAKilogramos");
    private static final QName _LibrasAKilogramosResponse_QNAME = new QName("http://ws.monster.edu.ec/", "librasAKilogramosResponse");
    private static final QName _PulgadasACentimetros_QNAME = new QName("http://ws.monster.edu.ec/", "pulgadasACentimetros");
    private static final QName _PulgadasACentimetrosResponse_QNAME = new QName("http://ws.monster.edu.ec/", "pulgadasACentimetrosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.monster.cliente.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusAFahrenheit }
     * 
     * @return
     *     the new instance of {@link CelsiusAFahrenheit }
     */
    public CelsiusAFahrenheit createCelsiusAFahrenheit() {
        return new CelsiusAFahrenheit();
    }

    /**
     * Create an instance of {@link CelsiusAFahrenheitResponse }
     * 
     * @return
     *     the new instance of {@link CelsiusAFahrenheitResponse }
     */
    public CelsiusAFahrenheitResponse createCelsiusAFahrenheitResponse() {
        return new CelsiusAFahrenheitResponse();
    }

    /**
     * Create an instance of {@link CentimetrosAPulgadas }
     * 
     * @return
     *     the new instance of {@link CentimetrosAPulgadas }
     */
    public CentimetrosAPulgadas createCentimetrosAPulgadas() {
        return new CentimetrosAPulgadas();
    }

    /**
     * Create an instance of {@link CentimetrosAPulgadasResponse }
     * 
     * @return
     *     the new instance of {@link CentimetrosAPulgadasResponse }
     */
    public CentimetrosAPulgadasResponse createCentimetrosAPulgadasResponse() {
        return new CentimetrosAPulgadasResponse();
    }

    /**
     * Create an instance of {@link FahrenheitACelsius }
     * 
     * @return
     *     the new instance of {@link FahrenheitACelsius }
     */
    public FahrenheitACelsius createFahrenheitACelsius() {
        return new FahrenheitACelsius();
    }

    /**
     * Create an instance of {@link FahrenheitACelsiusResponse }
     * 
     * @return
     *     the new instance of {@link FahrenheitACelsiusResponse }
     */
    public FahrenheitACelsiusResponse createFahrenheitACelsiusResponse() {
        return new FahrenheitACelsiusResponse();
    }

    /**
     * Create an instance of {@link KilogramosALibras }
     * 
     * @return
     *     the new instance of {@link KilogramosALibras }
     */
    public KilogramosALibras createKilogramosALibras() {
        return new KilogramosALibras();
    }

    /**
     * Create an instance of {@link KilogramosALibrasResponse }
     * 
     * @return
     *     the new instance of {@link KilogramosALibrasResponse }
     */
    public KilogramosALibrasResponse createKilogramosALibrasResponse() {
        return new KilogramosALibrasResponse();
    }

    /**
     * Create an instance of {@link LibrasAKilogramos }
     * 
     * @return
     *     the new instance of {@link LibrasAKilogramos }
     */
    public LibrasAKilogramos createLibrasAKilogramos() {
        return new LibrasAKilogramos();
    }

    /**
     * Create an instance of {@link LibrasAKilogramosResponse }
     * 
     * @return
     *     the new instance of {@link LibrasAKilogramosResponse }
     */
    public LibrasAKilogramosResponse createLibrasAKilogramosResponse() {
        return new LibrasAKilogramosResponse();
    }

    /**
     * Create an instance of {@link PulgadasACentimetros }
     * 
     * @return
     *     the new instance of {@link PulgadasACentimetros }
     */
    public PulgadasACentimetros createPulgadasACentimetros() {
        return new PulgadasACentimetros();
    }

    /**
     * Create an instance of {@link PulgadasACentimetrosResponse }
     * 
     * @return
     *     the new instance of {@link PulgadasACentimetrosResponse }
     */
    public PulgadasACentimetrosResponse createPulgadasACentimetrosResponse() {
        return new PulgadasACentimetrosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusAFahrenheit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CelsiusAFahrenheit }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "celsiusAFahrenheit")
    public JAXBElement<CelsiusAFahrenheit> createCelsiusAFahrenheit(CelsiusAFahrenheit value) {
        return new JAXBElement<>(_CelsiusAFahrenheit_QNAME, CelsiusAFahrenheit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusAFahrenheitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CelsiusAFahrenheitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "celsiusAFahrenheitResponse")
    public JAXBElement<CelsiusAFahrenheitResponse> createCelsiusAFahrenheitResponse(CelsiusAFahrenheitResponse value) {
        return new JAXBElement<>(_CelsiusAFahrenheitResponse_QNAME, CelsiusAFahrenheitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentimetrosAPulgadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CentimetrosAPulgadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "centimetrosAPulgadas")
    public JAXBElement<CentimetrosAPulgadas> createCentimetrosAPulgadas(CentimetrosAPulgadas value) {
        return new JAXBElement<>(_CentimetrosAPulgadas_QNAME, CentimetrosAPulgadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentimetrosAPulgadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CentimetrosAPulgadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "centimetrosAPulgadasResponse")
    public JAXBElement<CentimetrosAPulgadasResponse> createCentimetrosAPulgadasResponse(CentimetrosAPulgadasResponse value) {
        return new JAXBElement<>(_CentimetrosAPulgadasResponse_QNAME, CentimetrosAPulgadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitACelsius }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FahrenheitACelsius }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "fahrenheitACelsius")
    public JAXBElement<FahrenheitACelsius> createFahrenheitACelsius(FahrenheitACelsius value) {
        return new JAXBElement<>(_FahrenheitACelsius_QNAME, FahrenheitACelsius.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitACelsiusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FahrenheitACelsiusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "fahrenheitACelsiusResponse")
    public JAXBElement<FahrenheitACelsiusResponse> createFahrenheitACelsiusResponse(FahrenheitACelsiusResponse value) {
        return new JAXBElement<>(_FahrenheitACelsiusResponse_QNAME, FahrenheitACelsiusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KilogramosALibras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KilogramosALibras }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "kilogramosALibras")
    public JAXBElement<KilogramosALibras> createKilogramosALibras(KilogramosALibras value) {
        return new JAXBElement<>(_KilogramosALibras_QNAME, KilogramosALibras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KilogramosALibrasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KilogramosALibrasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "kilogramosALibrasResponse")
    public JAXBElement<KilogramosALibrasResponse> createKilogramosALibrasResponse(KilogramosALibrasResponse value) {
        return new JAXBElement<>(_KilogramosALibrasResponse_QNAME, KilogramosALibrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibrasAKilogramos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LibrasAKilogramos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "librasAKilogramos")
    public JAXBElement<LibrasAKilogramos> createLibrasAKilogramos(LibrasAKilogramos value) {
        return new JAXBElement<>(_LibrasAKilogramos_QNAME, LibrasAKilogramos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibrasAKilogramosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LibrasAKilogramosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "librasAKilogramosResponse")
    public JAXBElement<LibrasAKilogramosResponse> createLibrasAKilogramosResponse(LibrasAKilogramosResponse value) {
        return new JAXBElement<>(_LibrasAKilogramosResponse_QNAME, LibrasAKilogramosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PulgadasACentimetros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PulgadasACentimetros }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "pulgadasACentimetros")
    public JAXBElement<PulgadasACentimetros> createPulgadasACentimetros(PulgadasACentimetros value) {
        return new JAXBElement<>(_PulgadasACentimetros_QNAME, PulgadasACentimetros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PulgadasACentimetrosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PulgadasACentimetrosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "pulgadasACentimetrosResponse")
    public JAXBElement<PulgadasACentimetrosResponse> createPulgadasACentimetrosResponse(PulgadasACentimetrosResponse value) {
        return new JAXBElement<>(_PulgadasACentimetrosResponse_QNAME, PulgadasACentimetrosResponse.class, null, value);
    }

}
