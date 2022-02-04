import java.util.ArrayList;
import java.util.List;

public class Banco {
	
//Atributos
	private String nome;
	private ArrayList <ContaBancaria> contas;

//Construtor
	public Banco (String aNome) {
		contas= new ArrayList<ContaBancaria>(100);   //inicializar o ArrayList com 100 itens
	}

//Métodos
	public void criaConta (ContaBancaria c) {
		contas.add(c);
	}
	
	public ContaBancaria getConta(String aTitular) {
		for(ContaBancaria c: contas){
			if(c.getTitular().equalsIgnoreCase(aTitular)) {				//"STR".equalsIgnoreCase("str")
																		/*== ,   <=  e >= servem para comparar variávei do tipo primitivo (números, caractéres),
																		 * mas não para comparar Strings, que são objetos
																		 * Strings, Arrays e Classes são variáveis não primitivas*/
				return c;
			}
		}
		return null;									//no caso de não encontra conta, vai devolver um null (o próprio programa dá erro se não escrever esta linha)
	}
	
//Getters e Setters
	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(ArrayList<ContaBancaria> contas) {
		this.contas = contas;
	}
	


}
