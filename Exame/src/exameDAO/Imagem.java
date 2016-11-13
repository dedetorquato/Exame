package exameDAO;

import java.awt.image.BufferedImage;
import java.util.Calendar;
import java.util.List;

public class Imagem {
	
	private Long id;
	private Calendar dataInclusao;
	private String descricao;
	private BufferedImage imagem;
	private List<Tag> tags;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(Calendar dataInclusao) {
		this.dataInclusao = dataInclusao;
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
	public BufferedImage getImagem() {
		return imagem;
	}
	public void setImagem(BufferedImage imagem) {
		this.imagem = imagem;
	}

}
