package exameDAO.CID;

public class Grupo {
//	Observação: um grupo pode conter outros grupos.
	
	private String catInic; // código da primeira categoria do grupo;
	private String catFim; // código da última categoria do grupo;
	private String descricao; // descrição (nome) do grupo; e
	private String descrAbrev; // descrição (nome) abreviado do grupo, com até 50 caracteres.
	
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
	public String getDescrAbrev() {
		return descrAbrev;
	}
	public void setDescrAbrev(String descrAbrev) {
		this.descrAbrev = descrAbrev;
	}


}
