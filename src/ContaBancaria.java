import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
//Atributos
	private String titular;
	private double saldo=0;
	private LocalDate dataAbertura= LocalDate.now();
//Construtor
	public  ContaBancaria(String aTitular) {
		titular= aTitular;
		saldo= 0;							//acho que esta linha n�o � necess�ria
		dataAbertura= LocalDate.now();		//acho que esta linha n�o � necess�ria	
	}
	
//M�todos
	public String getInforma��oConta() {
		DecimalFormat decimalFmt  = new DecimalFormat("0.00");										//formatar com duas c.d.
		String saldoFormatado = decimalFmt.format(saldo);											//aplicar o m�todo de formatar com duas c.d. a saldo
		
																									//experiementar String.format("%.2f",saldo)
		DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd/MM/YYYY");						//formata��o da datapor dia/m�s/ano
        String dataAberturaFormatada= dateFmt.format(dataAbertura);									// aplicar o m�todo de formatar data � dataAbertura
        return titular + ": " +"Saldo: " + saldoFormatado +"; Data Abertura: " + dataAberturaFormatada;
	}
	
	public void depositar(double aValue) {
		saldo+= aValue;
	}
	
	public void levantar(double aValue) {
		if(aValue<=saldo) {
			saldo=saldo-aValue;
		}else {
			System.out.println("N�o � poss�vel efetuar opera��o. Saldo na conta inferior a " +String.format("%.2f",aValue) +"�");
	 		}
	}
//Getters e Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
	
}
