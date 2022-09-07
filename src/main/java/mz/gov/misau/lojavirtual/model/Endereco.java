package mz.gov.misau.lojavirtual.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mz.gov.misau.lojavirtual.enums.TipoEndereco;

@Entity
@Table(name = "endereco")
@SequenceGenerator(name = "seq_endereco",sequenceName = "seq_endereco",allocationSize = 1,initialValue = 1)
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_endereco")
	private Long id;
	
	private String bairro;
	
	private String rua;
	
	private String nCasa;
	
	private String quarteirao;
	
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT,name ="pessoa_fk"))
	private Pessoa pessoa;

	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco;

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getnCasa() {
		return nCasa;
	}


	public void setnCasa(String nCasa) {
		this.nCasa = nCasa;
	}


	public String getQuarteirao() {
		return quarteirao;
	}


	public void setQuarteirao(String quarteirao) {
		this.quarteirao = quarteirao;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}
	

	
}
