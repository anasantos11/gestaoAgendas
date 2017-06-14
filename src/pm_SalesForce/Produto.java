/**
 * Classe com dados dos produtos fornecidos pela empresa
 */
package pm_SalesForce;

public class Produto {
	private String descricao;
	private Categoria categoria;

	/**
	 * Construtor da classe produto
	 * 
	 * @param descricao
	 * @param categoria
	 */
	Produto(String desc, Categoria catg) {
		setDescricao(desc);
		setCategoria(catg);
	}

	/**
	 * Pegar descrição do produto
	 * 
	 * @return Descricao
	 */

	public String getDescricao() {
		return descricao;
	}

	/**
	 * Enviar descrição do produto
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Pegar categoria do produto
	 * 
	 * @return Categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * Enviar categoria do produto
	 * 
	 * @param categoria
	 */

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * Pegar valor do produto conforme sua categoria
	 * @return Valor
	 */
	public Double getValor() {
		double preco = 0.00;

		switch (this.getCategoria()) {
		case Automovel:
			preco = 2500.00;
			break;
		case Habitacao:
			preco = 3500.00;
			break;
		case Rural:
			preco = 2000.00;
			break;
		case Saude:
			preco = 550.00;
			break;
		}
		return preco;

	}
	
	/**
	 * Imprimir dados do produto
	 */

	@Override
	public String toString() {
		return "Categoria: " + getCategoria() + "\n" + "Preço: " + getValor() + "\n" + "Descrição: " + getDescricao();
	}

}
