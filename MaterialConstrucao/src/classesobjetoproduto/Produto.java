package classesobjetoproduto;

import javax.swing.JOptionPane;

public class Produto {
	
	private static int codigo=1;
	private int id;
	private String nome;
	private double preco;
	private int quantidade;

	public static int getCodigo() {
		return codigo++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void addProdutoEstoque(int qtProdutoSelecionado) {
		
		JOptionPane.showMessageDialog(null, "Foi adicionado ao estoque " + qtProdutoSelecionado + " quantidade(s) do produto escolhido!", "Produto Adicionado no Estoque", JOptionPane.INFORMATION_MESSAGE);
		
		qtProdutoSelecionado=getQuantidade()+qtProdutoSelecionado;
		setQuantidade(qtProdutoSelecionado);
	}
	
	public int delProdutoEstoque(int qtProdutoSelecionado) {
		
		if(qtProdutoSelecionado>getQuantidade()) {
			
			JOptionPane.showMessageDialog(null, "Nao é possivel efetuar a venda! O estoque possui apenas " + getQuantidade() + " quantidade(s) do produto selecionado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
		JOptionPane.showMessageDialog(null, "Foi removido do estoque " + qtProdutoSelecionado + " quantidade(s) do produto escolhido!", "Produto Removido do Estoque", JOptionPane.INFORMATION_MESSAGE);
		
		qtProdutoSelecionado=getQuantidade()-qtProdutoSelecionado;
		setQuantidade(qtProdutoSelecionado);
		}
		
		return qtProdutoSelecionado;
	}
}