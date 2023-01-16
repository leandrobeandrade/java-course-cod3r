package streams.reduce;

public class Reduzindo3 {

	public static void main(String[] args) {
		Media m1 = new Media();
		m1.adicionar(8.3);
		m1.adicionar(6.7);
		
		Media m2 = new Media();
		m2.adicionar(7.9);
		m2.adicionar(6.6);
		
		System.out.println(m1.getVal());
		System.out.println(m2.getVal());
		
		System.out.println(Media.combinar(m1, m2).getVal());
	}

}

class Media {
	private Double total = 0.0;
	private int qtd;
	
	public void adicionar(double val) {
		total += val;
		qtd++;
	}
	
	public double getVal() {
		return total / qtd;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.qtd = m1.qtd + m2.qtd;
		
		return resultante;
	}
}