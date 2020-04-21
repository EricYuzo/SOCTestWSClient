
package br.com.soc.test.ws.servico;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ListagemExames", targetNamespace = "http://servico.ws.test.soc.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ListagemExames {


    /**
     * 
     * @return
     *     returns br.com.soc.test.ws.servico.ListaExames
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarExames", targetNamespace = "http://servico.ws.test.soc.com.br/", className = "br.com.soc.test.ws.servico.ListarExames")
    @ResponseWrapper(localName = "listarExamesResponse", targetNamespace = "http://servico.ws.test.soc.com.br/", className = "br.com.soc.test.ws.servico.ListarExamesResponse")
    @Action(input = "http://servico.ws.test.soc.com.br/ListagemExames/listarExamesRequest", output = "http://servico.ws.test.soc.com.br/ListagemExames/listarExamesResponse")
    public ListaExames listarExames();

}