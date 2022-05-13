package br.com.sutanrrier.desafiosprint.main;

import java.sql.Date;
import java.time.LocalDate;

import br.com.sutanrrier.desafiosprint.model.entities.Carro;
import br.com.sutanrrier.desafiosprint.model.entities.Estacionamento;

public class Program {

	public static void main(String[] args) {
		Estacionamento estac1 = new Estacionamento(null, "Estacionamento SEPOG", Date.valueOf(LocalDate.now()));
		Carro car1 = new Carro(null, "Amarelo", "HYD-3830", 320.00, Date.valueOf(LocalDate.now()), estac1);
		Carro car2 = new Carro(null, "Vermelho", "HWR-3423", 360.00, Date.valueOf(LocalDate.now()), estac1);

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(estac1);
	}

}
