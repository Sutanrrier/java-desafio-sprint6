package br.com.sutanrrier.desafiosprint.model.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_estacionamento")
public class Estacionamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private Date dataCriacao;
	
	//Construtores
	public Estacionamento() {
		
	}
	public Estacionamento(Integer id, String nome, Date dataCriacao) {
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
	}

	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
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
		Estacionamento other = (Estacionamento) obj;
		return Objects.equals(id, other.id);
	}

	//toString
	@Override
	public String toString() {
		return "Estacionamento -> Id: " + id 
				+ " | Nome: " + nome 
				+ " | Adicionado em: " + dataCriacao;
	}
	
}
