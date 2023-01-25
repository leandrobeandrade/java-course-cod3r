package obeserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	public void registrarObservador(ObservadorChegadaAniversariante observ) {
		observadores.add(observ);
	}
	
	public void monitorar() {
		Scanner scan = new Scanner(System.in);
		String valor = "";
		
		while (!"sair".equals(valor)) {
			System.out.println("Aniversariante chegou? ");
			valor = scan.nextLine();
			
			if ("sim".equals(valor)) {
				// Cria o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				// notifica os observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}
		
		scan.close();
	}
}
