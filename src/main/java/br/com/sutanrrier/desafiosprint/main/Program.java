package br.com.sutanrrier.desafiosprint.main;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import br.com.sutanrrier.desafiosprint.connection.ConnectionFactory;
import br.com.sutanrrier.desafiosprint.model.dao.impl.EstacionamentoDaoJPA;
import br.com.sutanrrier.desafiosprint.model.dao.impl.CarroDaoJPA;
import br.com.sutanrrier.desafiosprint.model.entities.Carro;
import br.com.sutanrrier.desafiosprint.model.entities.Estacionamento;

public class Program {

	public static void main(String[] args) {
		
		//Amostras
		Estacionamento estac1 = new Estacionamento(null, "Estacionamento Teste", Date.valueOf(LocalDate.now()));
		Carro car1 = new Carro(null, "Cinza", "HVI-9195", 300.00, Date.valueOf(LocalDate.now()), estac1);
		Carro car2 = new Carro(null, "Vermelho", "HUF-8051", 360.00, Date.valueOf(LocalDate.now()), estac1);

		//Instanciando nossos objetos DAO
		CarroDaoJPA carroDao = new CarroDaoJPA();
		EstacionamentoDaoJPA estacionamentoDao = new EstacionamentoDaoJPA();
		
		//Inserindo entidades (Carro e Estacionamento
//		estacionamentoDao.insert(estac1);
//		carroDao.insert(car1);
//		carroDao.insert(car2);
		
		//Atualizando dados
//		car1 = carroDao.findById(1);
//		car1.setPlaca("SEM PLACA");
//		carroDao.update(car1);
		
		//Deletando elementos
//		carroDao.remove(5);
		
		//Listando unidades por id
		Carro carroBuscado = carroDao.findById(3);
		Estacionamento estacionamentoBuscado = estacionamentoDao.findById(1);
		System.out.println(carroBuscado);
		System.out.println(estacionamentoBuscado);
		System.out.println("\n=========================================\n");
		
		//Listando todas as unidades
		List<Carro> listaCarro = carroDao.findAll();
		for(Carro carro : listaCarro) {
			System.out.println(carro);
		}
		
		List<Estacionamento> listaEstacionamento = estacionamentoDao.findAll();
		for(Estacionamento estacionamento : listaEstacionamento) {
			System.out.println(estacionamento);
		}
		
		ConnectionFactory.closeConnection();
	}

}
