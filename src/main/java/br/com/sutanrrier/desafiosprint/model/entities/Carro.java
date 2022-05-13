package br.com.sutanrrier.desafiosprint.model.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_carro")
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String cor;
	private String placa;
	private Double velocidademax;
	private Date dataCriacao;
	
	@ManyToOne
	private Estacionamento estacionamento;
	
	//Construtores
	public Carro() {
		
	}
	public Carro(Integer id, String cor, String placa, Double velocidademax, Date dataCriacao,
			Estacionamento estacionamento) {
		this.id = id;
		this.cor = cor;
		this.placa = placa;
		this.velocidademax = velocidademax;
		this.dataCriacao = dataCriacao;
		this.estacionamento = estacionamento;
	}

	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Double getVelocidademax() {
		return velocidademax;
	}
	public void setVelocidademax(Double velocidademax) {
		this.velocidademax = velocidademax;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Estacionamento getEstacionamento() {
		return estacionamento;
	}
	public void setEstacionamento(Estacionamento estacionamento) {
		this.estacionamento = estacionamento;
	}
	
	//HashCode e equals
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
		Carro other = (Carro) obj;
		return Objects.equals(id, other.id);
	}
	
	//ToString
	@Override
	public String toString() {
		return "Carro [id=" + id + ", cor=" + cor + ", placa=" + placa + ", velocidademax=" + velocidademax
				+ ", dataCriacao=" + dataCriacao + ", estacionamento=" + estacionamento + "]";
	}
	
}
