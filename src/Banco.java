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
	
//Métodos
	public void criaConta (ContaBancaria aContaBancaria) {
		contas.add(aContaBancaria);					//O ARRAY TEM CAPACIDADE LIMITADA - FALTA VERIFICAR SE HÁ ESPAÇO
	}
	
	public ContaBancaria getConta(String aTitular) {
		for(ContaBancaria i: contas){
			if(i.getTitular().equalsIgnoreCase(aTitular)) {				//"STR".equalsIgnoreCase("str")
																		/*== ,   <=  e >= servem para comparar variávei do tipo primitivo (números, caractéres),
																		 * mas não para comparar Strings, que são objetos
																		 * Strings, Arrays e Classes são variáveis não primitivas*/
				return i;
			}else {
				System.out.println("Não foi encontrada nenhuma conta com " + aTitular +" como titular.");
			}
		}
		return null;									//no caso de não encontra conta, vai devolver um null (o próprio programa dá erro se não escrever esta linha)
		}
	
	
	public void criaCasa (Casa aCasa) {
		casas.add(aCasa);
	}
	
	public void removeCasa (String aMorada) {
		for(Casa i:casas) {		
			if (i.getMorada().equalsIgnoreCase(aMorada)) {
			casas.remove(i);						//FALTA RESOLVER POSIÇÕES	
			}else {
				System.out.println("Não foi encontrada nenhuma casa com a morada " + aMorada);
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
