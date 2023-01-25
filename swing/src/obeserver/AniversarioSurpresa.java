package obeserver;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		porteiro.registrarObservador(ev -> System.out.println("Ocorreu em: " + ev.getMomento()));
		porteiro.monitorar();
	}

}
