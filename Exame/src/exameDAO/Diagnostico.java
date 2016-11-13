package exameDAO;

import java.util.Calendar;
import java.util.List;

import exameDAO.CID.Subcategoria;


public class Diagnostico {
	
	private Long id;
	private Calendar data;
	private String descricao;
	private List<Tag> tags;
	private List<Subcategoria> cids;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public List<Subcategoria> getCids() {
		return cids;
	}
	public void setCids(List<Subcategoria> cids) {
		this.cids = cids;
	}

}
