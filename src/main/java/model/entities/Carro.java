package model.entities;

import java.sql.Date;
import java.util.Objects;

public class Carro {
	private Integer id;
	private String cor;
	private String placa;
	private Double velocidademax;
	private Date dataCriacao;
	private Integer idEstacionamento;
	
	//Construtores
	public Carro(Integer id, String cor, String placa, Double velocidademax, Date dataCriacao,
			Integer idEstacionamento) {
		this.id = id;
		this.cor = cor;
		this.placa = placa;
		this.velocidademax = velocidademax;
		this.dataCriacao = dataCriacao;
		this.idEstacionamento = idEstacionamento;
	}
	
	public Carro() {
		
	}
	
	//Getters e Setters
	public Integer getId() {
		return id;
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

	public Integer getIdEstacionamento() {
		return idEstacionamento;
	}

	public void setIdEstacionamento(Integer idEstacionamento) {
		this.idEstacionamento = idEstacionamento;
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
				+ ", dataCriacao=" + dataCriacao + ", idEstacionamento=" + idEstacionamento + "]";
	}
	
}
