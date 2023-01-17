package errors.personalizadosOutros;

public class StringVaziaException extends Exception {
	private static final long serialVersionUID = 1L;
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeAtributo) {
		this.nomeDoAtributo = nomeAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
	}
}
