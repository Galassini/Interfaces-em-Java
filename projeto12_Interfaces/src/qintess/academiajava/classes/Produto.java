package qintess.academiajava.classes;

public class Produto {
	private String descricao;
	private String categoria;
	private double preco;
	private final int codigo;

	private static int CONTADOR = 1;

	public Produto(String descricao, String categoria, double preco) {
		this.codigo = CONTADOR++;
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setCategoria(categoria);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new NumberFormatException("Pre�o n�o pode ser negativo");
		}
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	// Metodos Adicionais
	public void receber(String descricao, String categoria, double preco) {
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);
	}

	public String mostrar() {
		return "Codigo: " + this.getCodigo() + "\nDescri��o: " + this.getDescricao() + "\nCategoria: "
				+ this.getCategoria() + "\nPre�o: " + this.getPreco();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Produto) {
			Produto produto = (Produto) obj;
			if (this.getDescricao().equals(produto.getDescricao()) && this.getCategoria().equals(produto.getCategoria())
					&& this.getPreco() == produto.getPreco())
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.getCodigo() + " - " + this.getDescricao();
	}

}
