import java.util.Scanner;

public class Main {
	
	  public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
		  
		  
		  Banco estrela= new Banco("Banco Estrela"); 				//Criar Banco
		  
		  ContaBancaria c1= new ContaBancaria("Jo�o Neves");		//Criar Conta
		  ContaBancaria c2= new ContaBancaria("Rita Silva");		//Criar Conta
		  estrela.criaConta (c1);									//Associar conta ao array contas do Banco
		  estrela.criaConta (c2);									//Associar conta ao array contas do Banco
		  c1.setSaldo(200.25);										// Alterar saldo inicila desta conta, para testar main
		  

//FALTA MENU
		 System.out.println("Titular: ");
		 String titular = sc.nextLine();
		 ContaBancaria c= estrela.getConta(titular);

		    int i =0;
		    while (i != 3){
		    	
			    System.out.println("\nDep�sito: 1\nLevantamento: 2\nSair: 3");
			    i = sc.nextInt();
			    
			    switch(i) {
			    case 1:
			    	System.out.println("Quantia a depositar:");
			    	double quantiaD = sc.nextDouble();
			    	c.depositar(quantiaD);
				    System.out.println(c.getInforma��oConta());
				    break;
			    case 2:
			    	System.out.println("Quantia a levantar:");
			    	double quantiaL = sc.nextDouble();
			    	c.levantar(quantiaL);
			    															//ERRO: ACHO QUE N�O � SUPOSTO APRESENTAR DADOS DE CONTA QUANDO SALDO N�O � ATUALIZADO
				    System.out.println(c.getInforma��oConta());	    
			    }
			      	
			   
		    }
		    
		    
		    
		    sc.close(); 			  
	  }
}
