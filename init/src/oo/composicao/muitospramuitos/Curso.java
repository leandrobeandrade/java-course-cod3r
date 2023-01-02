package oo.composicao.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();	// Não pode ser instanciada novamente
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionarAlunos(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
