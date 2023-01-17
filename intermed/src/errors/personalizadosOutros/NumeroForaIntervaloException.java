package errors.personalizadosOutros;

public class NumeroForaIntervaloException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeDoAtributo = nomeAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora de intervalo.", nomeDoAtributo);
	}
}
