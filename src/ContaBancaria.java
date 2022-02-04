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
		saldo= 0;							//acho que esta linha não é necessária
		dataAbertura= LocalDate.now();		//acho que esta linha não é necessária	
	}
	
//Métodos
	public String getInformaçãoConta() {
		DecimalFormat decimalFmt  = new DecimalFormat("0.00");										//formatar com duas c.d.
		String saldoFormatado = decimalFmt.format(saldo);											//aplicar o método de formatar com duas c.d. a saldo
		
																									//experiementar String.format("%.2f",saldo)
		DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd/MM/YYYY");						//formatação da datapor dia/mês/ano
        String dataAberturaFormatada= dateFmt.format(dataAbertura);									// aplicar o método de formatar data à dataAbertura
        return titular + ": " +"Saldo: " + saldoFormatado +"; Data Abertura: " + dataAberturaFormatada;
	}
	
	public void depositar(double aValue) {
		saldo+= aValue;
	}
	
	public void levantar(double aValue) {
		if(aValue<=saldo) {
			saldo=saldo-aValue;
		}else {
			System.out.println("Não é possível efetuar operação. Saldo na conta inferior a " +String.format("%.2f",aValue) +"€");
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
