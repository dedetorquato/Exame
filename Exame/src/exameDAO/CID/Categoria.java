package exameDAO.CID;

public class Categoria {
	
	private String cat;        // código da categoria;
	private char[] classif;    // indica se a situação da categoria em relação à classificação cruz/asterisco:
	                           // em branco: não tem dupla classificação;
	                           // +: classificação por etiologia; e
	                           // *: classificação por manifestação.
	private String descricao;  // descrição (nome) da categoria;
	private String descrAbrev; // descrição (nome) abreviado da categoria, com até 50 caracteres (inclui o código da categoria);
	private String refer;      // contém, quando a categoria tiver dupla classificação, o código da categoria segundo a outra classificação (nem todos os casos de dupla classificação contém este campo); e
	private String excluidos;  // contém o(s) código(s) de categorias excluídas que agora fazem parte desta categoria.
	
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public char[] getClassif() {
		return classif;
	}
	public void setClassif(char[] classif) {
		this.classif = classif;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescrAbrev() {
		return descrAbrev;
	}
	public void setDescrAbrev(String descrAbrev) {
		this.descrAbrev = descrAbrev;
	}
	public String getRefer() {
		return refer;
	}
	public void setRefer(String refer) {
		this.refer = refer;
	}
	public String getExcluidos() {
		return excluidos;
	}
	public void setExcluidos(String excluidos) {
		this.excluidos = excluidos;
	}


}
