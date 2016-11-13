package exameDAO.CID;

public class GrupoO {
	

	private String catInic;   // código da primeira categoria do grupo;
	private String catFim;    // código da última categoria do grupo;
	private char[] restrSexo; // indica se a subcategoria só pode ser usada para homens ou mulheres:
	private String descricao; // descrição (nome) do grupo; e
	private String refer;     // contém, a referência do grupo na classificação do capítulo II da CID-10 (Neoplasias).
	
	public String getCatInic() {
		return catInic;
	}
	public void setCatInic(String catInic) {
		this.catInic = catInic;
	}
	public String getCatFim() {
		return catFim;
	}
	public void setCatFim(String catFim) {
		this.catFim = catFim;
	}
	public char[] getRestrSexo() {
		return restrSexo;
	}
	public void setRestrSexo(char[] restrSexo) {
		this.restrSexo = restrSexo;
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
