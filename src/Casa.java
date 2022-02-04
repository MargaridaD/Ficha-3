
public class Casa {
//Atributos
	private String morada;
	private double precoCusto;
	private double precoVenda;
	
//Construtor
	public Casa () {

	}
	
	public Casa (String aMorada) {
		morada = aMorada;
	}
	
//Métodos
	public double getMargemLucro() {
		double margemLucro= precoVenda-precoCusto;
		return margemLucro;
	}
	
	public double getPercentMargemLucro() {
		double percetagemMargemLucro= precoVenda/precoCusto;
		return percetagemMargemLucro;
	}
	
	
//Getters e Setters
	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	

}
