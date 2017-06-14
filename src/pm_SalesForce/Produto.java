package pm_SalesForce;

public class Produto {
	private String descricao;
	private Categoria categoria;
	
	Produto(String desc, Categoria catg){
		setDescricao(desc);
		setCategoria(catg);		
	}	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Double getValor(){		
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

}
