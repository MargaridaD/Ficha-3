
public class MainCasa {

	public static void main(String[] args) {
		Casa casa1= new Casa ("Lisboa");
		casa1.setPrecoCusto(100000);
		casa1.setPrecoVenda(125000);
		
		Casa casa2= new Casa ();
		casa2.setMorada("Porto");
		casa2.setPrecoCusto(300150);
		casa2.setPrecoVenda(310000);
		
		Casa casa3= new Casa ("Funchal");
		casa3.setPrecoCusto(128000);
		casa3.setPrecoVenda(112000);
		
		System.out.println("\nMorada: " + casa1.getMorada() + "\nPreço de custo: " + casa1.getPrecoCusto() + "\nPreço de venda: " +casa1.getPrecoVenda() +"\nMargem de Lucro: " + casa1.getMargemLucro() + "\nPercentagem de Margem de Lucro: " + casa1.getPercentMargemLucro());  
				
	}

}
