package campo_minado_swing.visao;

import javax.swing.JFrame;

import campo_minado_swing.modelo.Tabuleiro;

public class TelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 1);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
}
