package streams.filter;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio {

	public static void main(String[] args) throws ParseException {
		Carro c0 = new Carro("A01", "Audi", 2015);
		Carro c1 = new Carro("BMW X1", "BMW", 2016);
		Carro c2 = new Carro("Mustang", "Ford", 2019);
		Carro c3 = new Carro("Bravo", "Fiat", 2020);
		Carro c4 = new Carro("Linea", "Fiat", 2015);
		Carro c5 = new Carro("Territory", "Ford", 2021);
		Carro c6 = new Carro("Cruze", "GM", 2022);
		Carro c7 = new Carro("Chevete", "GM", 1995);
		Carro c8 = new Carro("Freemont", "Fiat", 2018);
		Carro c9 = new Carro("Corsa", "GM", 2014);
		
		List<Carro> carros = Arrays.asList(c0, c1, c2, c3, c4, c5, c6, c7, c8, c9);
		Predicate<Carro> letraInicial = c -> c.marca.startsWith("F");
		Predicate<Carro> antes2020 = c -> c.ano < 2020;
		
		carros.stream().filter(letraInicial).filter(antes2020).forEach(System.out::println);
	}

}

class Carro {
	public final String modelo;
	public final String marca;
	public final int ano;
	
	public Carro(String nome, String marca, int ano) {
		this.modelo = nome;
		this.marca = marca;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + " da marca: " + marca + " do ano: " + ano;
	}
	
}