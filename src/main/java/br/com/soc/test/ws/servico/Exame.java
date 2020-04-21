
package br.com.soc.test.ws.servico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for exame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exame"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="finalidade" type="{http://servico.ws.test.soc.com.br/}finalidade" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="medico" type="{http://servico.ws.test.soc.com.br/}medico" minOccurs="0"/&gt;
 *         &lt;element name="participante" type="{http://servico.ws.test.soc.com.br/}vinculoEmpresaFuncionario" minOccurs="0"/&gt;
 *         &lt;element name="resultado" type="{http://servico.ws.test.soc.com.br/}resultado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exame", propOrder = {
    "data",
    "finalidade",
    "id",
    "medico",
    "participante",
    "resultado"
})
public class Exame {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected Finalidade finalidade;
    protected Integer id;
    protected Medico medico;
    protected VinculoEmpresaFuncionario participante;
    protected Resultado resultado;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the finalidade property.
     * 
     * @return
     *     possible object is
     *     {@link Finalidade }
     *     
     */
    public Finalidade getFinalidade() {
        return finalidade;
    }

    /**
     * Sets the value of the finalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Finalidade }
     *     
     */
    public void setFinalidade(Finalidade value) {
        this.finalidade = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the medico property.
     * 
     * @return
     *     possible object is
     *     {@link Medico }
     *     
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * Sets the value of the medico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Medico }
     *     
     */
    public void setMedico(Medico value) {
        this.medico = value;
    }

    /**
     * Gets the value of the participante property.
     * 
     * @return
     *     possible object is
     *     {@link VinculoEmpresaFuncionario }
     *     
     */
    public VinculoEmpresaFuncionario getParticipante() {
        return participante;
    }

    /**
     * Sets the value of the participante property.
     * 
     * @param value
     *     allowed object is
     *     {@link VinculoEmpresaFuncionario }
     *     
     */
    public void setParticipante(VinculoEmpresaFuncionario value) {
        this.participante = value;
    }

    /**
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

}
