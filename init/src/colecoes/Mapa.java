package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<>();
		
		mapa.put(1, "Fulano");
		mapa.put(2, "Ciclano");
		mapa.put(3, "Beltrano");
		mapa.put(4, "Belciclano");
		
		System.out.println(mapa.size());
		System.out.println(mapa.isEmpty());
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println(mapa.entrySet());
		System.out.println(mapa.containsKey(1));
		System.out.println(mapa.containsValue("Outro"));
		
		for (int chave: mapa.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: mapa.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro: mapa.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue());
		}
		
//		System.out.println(mapa.remove(1));
//		System.out.println(mapa.remove(1, "Outro"));	// Não remove pq o valor não é o passado
	}

}
