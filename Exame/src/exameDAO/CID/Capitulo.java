package exameDAO.CID;
//teste
public class Capitulo {
	
	private short numCap; // número do capítulo (em numeração arábica); se igual a zero, indica o capítulo que contém os códigos não oficialmente pertinentes à CID-10;
	private String catInic; // código da primeira categoria do capítulo;
	private String catFim; // código da última categoria do capítulo;
	private String descricao; // descrição (nome) do capítulo; e
	private String descricaoAbrev; // descrição (nome) abreviado do capítulo, com até 50 caracteres.
	
	public short getNumCap() {
		return numCap;
	}
	public void setNumCap(short numCap) {
		this.numCap = numCap;
	}
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricaoAbrev() {
		return descricaoAbrev;
	}
	public void setDescricaoAbrev(String descricaoAbrev) {
		this.descricaoAbrev = descricaoAbrev;
	}

}
