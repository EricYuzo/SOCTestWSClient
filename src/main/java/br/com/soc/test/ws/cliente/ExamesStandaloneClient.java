package br.com.soc.test.ws.cliente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.soc.test.ws.servico.Exame;
import br.com.soc.test.ws.servico.ListagemExames;
import br.com.soc.test.ws.servico.ListagemExamesService;

public class ExamesStandaloneClient {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		ListagemExamesService servico = new ListagemExamesService();
		ListagemExames retorno = servico.getListagemExamesPort();

		List<Exame> exames = retorno.listarExames().getExames();

		System.out.println("Quantidade de exames retornados: " + (exames != null ? exames.size() : "sem retorno"));

		for (Exame exame : exames) {
			StringBuilder texto = new StringBuilder();
			texto.append(String.format("Exame %s realizado em %s: \n",
					exame.getFinalidade().getNome(),
					df.format(exame.getData().toGregorianCalendar().getTime())));
			texto.append(String.format("\tEmpresa: %s (%s) \n",
					exame.getParticipante().getEmpresa().getNome(),
					exame.getParticipante().getEmpresa().getCnpj()));
			texto.append(String.format("\tFuncionário: %s, %s (%s) \n",
					exame.getParticipante().getFuncionario().getNome(),
					exame.getParticipante().getCargo(),
					exame.getParticipante().getSetor()));
			texto.append(String.format("\tMédico %s (%s) \n",
					exame.getMedico().getNome(),
					exame.getMedico().getCrm()));
			texto.append(String.format("\tParecer: %s \n", exame.getResultado().getNome()));

			System.out.println(texto);
		}
	}

}
