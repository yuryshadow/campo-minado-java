package br.com.yuri.cm;

import br.com.yuri.cm.modelo.Tabuleiro;
import br.com.yuri.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
		
	}
}
