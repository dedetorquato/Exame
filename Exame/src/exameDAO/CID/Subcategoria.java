package exameDAO.CID;

public class Subcategoria {
//	Observação: estão consideradas como subcategorias também as categorias que não têm subcategorias.
	

	private String subCat;     // código da subcategoria (sem incluir ponto); para categorias sem subcategorias, o quarto caractere está em branco;
	private char[] classif;    // indica se a situação da subcategoria em relação à classificação cruz/asterisco:
	                           // em branco: não tem dupla classificação;
	                           // +: classificação por etiologia; e
	                           // *: classificação por manifestação.
	private char[] restrSexo;  // indica se a subcategoria só pode ser usada para homens ou mulheres:
	                           // em branco: pode ser utilizada em qualquer situação;
	                           // F: só deve ser utilizada para o sexo feminino; e
	                           // M: só deve ser utilizada para o sexo masculino.
	private String causaObito; // indica se a subcategoria pode causar óbito:
	                           // em branco: não há restrição; e
	                           // N: a subcategoria tem pouca probabilidade de causar óbito.
	                           // Observação: além disto, deve-se atentar para o fato de que as subcategorias da classificação asterisco não devem ser utilizadas na classificação de causas de óbitos, assim como as subcategorias do capítulo XIX e do capítulo XXI.
	private String descricao;  // descrição (nome) da subcategoria;
	private String descrAbrev; // descrição (nome) abreviado da subcategoria, com até 50 caracteres (inclui o código da subcategoria);
	private String refer;      // contém, quando a subcategoria tiver dupla classificação, o código da subcategoria segundo a outra classificação (nem todos os casos de dupla classificação contém este campo); e
	private String excluidos;  // contém o(s) código(s) de subcategorias excluídas que agora fazem parte desta subcategoria.
	
	public String getSubCat() {
		return subCat;
	}
	public void setSubCat(String subCat) {
		this.subCat = subCat;
	}
	public char[] getClassif() {
		return classif;
	}
	public void setClassif(char[] classif) {
		this.classif = classif;
	}
	public char[] getRestrSexo() {
		return restrSexo;
	}
	public void setRestrSexo(char[] restrSexo) {
		this.restrSexo = restrSexo;
	}
	public String getCausaObito() {
		return causaObito;
	}
	public void setCausaObito(String causaObito) {
		this.causaObito = causaObito;
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
