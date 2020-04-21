
package br.com.soc.test.ws.servico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.soc.test.ws.servico package. 
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

    private final static QName _ListarExames_QNAME = new QName("http://servico.ws.test.soc.com.br/", "listarExames");
    private final static QName _ListarExamesResponse_QNAME = new QName("http://servico.ws.test.soc.com.br/", "listarExamesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.soc.test.ws.servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarExames }
     * 
     */
    public ListarExames createListarExames() {
        return new ListarExames();
    }

    /**
     * Create an instance of {@link ListarExamesResponse }
     * 
     */
    public ListarExamesResponse createListarExamesResponse() {
        return new ListarExamesResponse();
    }

    /**
     * Create an instance of {@link ListaExames }
     * 
     */
    public ListaExames createListaExames() {
        return new ListaExames();
    }

    /**
     * Create an instance of {@link Exame }
     * 
     */
    public Exame createExame() {
        return new Exame();
    }

    /**
     * Create an instance of {@link Finalidade }
     * 
     */
    public Finalidade createFinalidade() {
        return new Finalidade();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link VinculoEmpresaFuncionario }
     * 
     */
    public VinculoEmpresaFuncionario createVinculoEmpresaFuncionario() {
        return new VinculoEmpresaFuncionario();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link Funcionario }
     * 
     */
    public Funcionario createFuncionario() {
        return new Funcionario();
    }

    /**
     * Create an instance of {@link Resultado }
     * 
     */
    public Resultado createResultado() {
        return new Resultado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarExames }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarExames }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.ws.test.soc.com.br/", name = "listarExames")
    public JAXBElement<ListarExames> createListarExames(ListarExames value) {
        return new JAXBElement<ListarExames>(_ListarExames_QNAME, ListarExames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarExamesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarExamesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.ws.test.soc.com.br/", name = "listarExamesResponse")
    public JAXBElement<ListarExamesResponse> createListarExamesResponse(ListarExamesResponse value) {
        return new JAXBElement<ListarExamesResponse>(_ListarExamesResponse_QNAME, ListarExamesResponse.class, null, value);
    }

}
