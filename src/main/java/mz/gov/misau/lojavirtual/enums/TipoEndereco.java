package mz.gov.misau.lojavirtual.enums;

public enum TipoEndereco {
	COBRANCA("Cobranca"),
	ENTREGA("Entrega");
	
	private String descricao;

	private TipoEndereco(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		return this.descricao;
	}
}
