package com.campo_minado;

import com.campo_minado.modelo.Tabuleiro;
import com.campo_minado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println("-");
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}

}
