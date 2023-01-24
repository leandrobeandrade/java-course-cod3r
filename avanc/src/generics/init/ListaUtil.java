package generics.init;

import java.util.List;

public class ListaUtil {
	// Mesmo que fazer (List<? extends Object>)
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1);
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
