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

}
