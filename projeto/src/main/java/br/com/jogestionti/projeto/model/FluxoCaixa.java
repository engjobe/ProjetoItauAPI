package br.com.jogestionti.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbfluxocaixa")

public class FluxoCaixa {

	@Id
	
	@Column(name="conta") 
	private int conta; 
	
	@Column(name="fluxo") 
	private int fluxo; 
	
	@Column(name="entrada") 
	private String entrada; 
	
	@Column(name="saida")
	private String saida;

	@ManyToOne
	@JoinColumn(name="ag")
	private Correntista titular;

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getFluxo() {
		return fluxo;
	}

	public void setFluxo(int fluxo) {
		this.fluxo = fluxo;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public Correntista getTitular() {
		return titular;
	}

	public void setTitular(Correntista titular) {
		this.titular = titular;
	}
	
}
