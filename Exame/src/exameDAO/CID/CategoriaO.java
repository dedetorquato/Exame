package exameDAO.CID;

public class CategoriaO {
	
	private String cat;       // código da categoria;
	private String descricao; // descrição (nome) da categoria; e
	private String refer;     // contém a referência da categoria na classificação do capítulo II da CID-10 (Neoplasias);
	
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRefer() {
		return refer;
	}
	public void setRefer(String refer) {
		this.refer = refer;
	}

}
