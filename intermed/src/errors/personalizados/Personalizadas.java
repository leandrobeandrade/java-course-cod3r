package errors.personalizados;

public class Personalizadas {

	public static void main(String[] args) {
//		Aluno aluno = new Aluno("", -7.0);
//		Validar.aluno(aluno);

		try {
			Aluno aluno = new Aluno("Ana", 7.0);	// Mudar esses valores pra testes
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("FIM!");
	}

}
