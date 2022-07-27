package classesobjetoscasa;

import java.util.List;

public class Casa {

	private String descricao;
	private String cor;
	private List<Janela> listaDeJanelas;
	private List<Porta> listaDePortas;
	
	//Armazenando o valor recebido para a descricao da casa
	public String getDescricao() {
		return this.descricao;
	}
	
	//Recebendo o valor enviado para a descricao da casa
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Armazenando o valor recebido para a cor da casa
	public String getCor() {
		return this.cor;
	}
	
	//Recebe o valor enviado para a cor da casa
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Armazenando o valor recebido para a descricao e status da(s) porta(s) da casa
	public List<Janela> getListaDeJanelas() {
		return this.listaDeJanelas;
	}
	
	//Recebendo o valor enviado para a descricao e status da(s) porta(s) da casa
	public void setListaDeJanelas(List<Janela> listaDeJanelas) {
		this.listaDeJanelas = listaDeJanelas;
	}
	
	//Armazenando o valor recebido para a descricao e status da(s) janelas(s) da casa
	public List<Porta> getListaDePortas() {
		return this.listaDePortas;
	}
	
	//Recebendo o valor enviado para a descricao e status da(s) janelas(s) da casa
	public void setListaDePortas(List<Porta> listadePortas) {
		this.listaDePortas = listadePortas;
	}
	
	/*
	 * O metodo construirCasa() esta preparado para receber a Lista de Janelas(descricao, status),
	 * Lista de Portas(descricao, status), cor e descricao da casa. Observe que apos receber os
	 * valores da casa, estes sao repassados para os seus respectivos metodos de armazenamento,
	 * setListaJanelas(), setListaDePortas(), setCor(), setDescricao()
	 */
	public void construirCasa(String descricao, String cor, List<Janela> listaDeJanelas, List<Porta> listaDePortas) {
		
		setDescricao(descricao);
		setCor(cor);
		setListaDeJanelas(listaDeJanelas);
		setListaDePortas(listaDePortas);
	}
	
	/*
	 * O método abaixo recebe a cor informada pelo usuario e na sequencia o redireciona para o metodo 
	 * setCor(), para que este o armazene no atributo cor
	 */
	public void pintarCasa(String cor) {
		setCor(cor);
	}
	
	public void movimentarPorta(int index, int status) {
		
		Porta porta = listaDePortas.get(index);
		porta.setStatus(status);
		listaDePortas.set(index, porta);
	}
	
	public void movimentarJanela(int index, int status) {
		
		Janela janela = listaDeJanelas.get(index);
		janela.setStatus(status);
		listaDeJanelas.set(index, janela);
	}
}