package mz.gov.misau.lojavirtual;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pessoaJuridica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa {


	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String nuit;
	
	private Date dataAlvara;
	
	private String abreviatura;

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public Date getDataAlvara() {
		return dataAlvara;
	}

	public void setDataAlvara(Date dataAlvara) {
		this.dataAlvara = dataAlvara;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	
}
