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

//M�todos
	public void criaConta (ContaBancaria c) {
		contas.add(c);
	}
	
	public ContaBancaria getConta(String aTitular) {
		for(ContaBancaria c: contas){
			if(c.getTitular().equalsIgnoreCase(aTitular)) {				//"STR".equalsIgnoreCase("str")
																		/*== ,   <=  e >= servem para comparar vari�vei do tipo primitivo (n�meros, caract�res),
																		 * mas n�o para comparar Strings, que s�o objetos
																		 * Strings, Arrays e Classes s�o vari�veis n�o primitivas*/
				return c;
			}
		}
		return null;									//no caso de n�o encontra conta, vai devolver um null (o pr�prio programa d� erro se n�o escrever esta linha)
	}
	
//Getters e Setters
	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(ArrayList<ContaBancaria> contas) {
		this.contas = contas;
	}
	


}
