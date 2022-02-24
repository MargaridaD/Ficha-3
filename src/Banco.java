import java.util.ArrayList;
import java.util.List;

public class Banco {
	
//Atributos
	private String nome;
	private ArrayList <ContaBancaria> contas;
	private ArrayList <Casa> casas;

//Construtor
	public Banco (String aNome) {
		contas= new ArrayList<ContaBancaria>(100);   //inicializar o ArrayList com 100 itens
		casas= new ArrayList<Casa>();					//inicializar o ArrayList
	}
	
//M�todos
	public void criaConta (ContaBancaria aContaBancaria) {
		contas.add(aContaBancaria);					//O ARRAY TEM CAPACIDADE LIMITADA - FALTA VERIFICAR SE H� ESPA�O
	}
	
	public ContaBancaria getConta(String aTitular) {
		for(ContaBancaria i: contas){
			if(i.getTitular().equalsIgnoreCase(aTitular)) {				//"STR".equalsIgnoreCase("str")
																		/*== ,   <=  e >= servem para comparar vari�vei do tipo primitivo (n�meros, caract�res),
																		 * mas n�o para comparar Strings, que s�o objetos
																		 * Strings, Arrays e Classes s�o vari�veis n�o primitivas*/
				return i;
			}else {
				System.out.println("N�o foi encontrada nenhuma conta com " + aTitular +" como titular.");
			}
		}
		return null;									//no caso de n�o encontra conta, vai devolver um null (o pr�prio programa d� erro se n�o escrever esta linha)
		}
	
	
	public void criaCasa (Casa aCasa) {
		casas.add(aCasa);
	}
	
	public void removeCasa (String aMorada) {
		for(Casa i:casas) {		
			if (i.getMorada().equalsIgnoreCase(aMorada)) {
			casas.remove(i);						//FALTA RESOLVER POSI��ES	
			}else {
				System.out.println("N�o foi encontrada nenhuma casa com a morada " + aMorada);
			}
		}
	}
	
	public double getLucroPrevisto() {
		double lucroPrevisto= 0;  
		for(Casa i:casas) {
			lucroPrevisto+= i.getMargemLucro();
		}
		return lucroPrevisto;
	}
//Getters e Setters
	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}

	public void setContas(ArrayList<ContaBancaria> contas) {
		this.contas = contas;
	}
	


}
