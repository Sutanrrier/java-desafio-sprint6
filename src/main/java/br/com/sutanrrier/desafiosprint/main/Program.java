package br.com.sutanrrier.desafiosprint.main;

import java.sql.Date;
import java.time.LocalDate;

import br.com.sutanrrier.desafiosprint.connection.ConnectionFactory;
import br.com.sutanrrier.desafiosprint.model.dao.impl.CarroDAOImpl;
import br.com.sutanrrier.desafiosprint.model.dao.impl.EstacionamentoDAOImpl;
import br.com.sutanrrier.desafiosprint.model.entities.Carro;
import br.com.sutanrrier.desafiosprint.model.entities.Estacionamento;

public class Program {

	public static void main(String[] args) {
		
		//Amostras
		Estacionamento estac1 = new Estacionamento(null, "Estacionamento SEPOG", Date.valueOf(LocalDate.now()));
		Carro car1 = new Carro(null, "Amarelo", "HYD-3830", 320.00, Date.valueOf(LocalDate.now()), estac1);
		Carro car2 = new Carro(null, "Vermelho", "HWR-3423", 360.00, Date.valueOf(LocalDate.now()), estac1);

		//Instanciando nossos objetos DAO
		CarroDAOImpl carroDao = new CarroDAOImpl();
		EstacionamentoDAOImpl estacionamentoDao = new EstacionamentoDAOImpl();
		
		//Inserindo entidades (Carro e Estacionamento
		estacionamentoDao.insert(estac1);
		carroDao.insert(car1);
		carroDao.insert(car2);
		
		ConnectionFactory.closeConnection();
		System.out.println("\nPrograma Finalizado!");
	}

}
