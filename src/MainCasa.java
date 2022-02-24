import java.util.ArrayList;
import java.util.List;

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
		
		List<Casa> casas = new ArrayList<Casa>();
		casas.add(casa1);
		casas.add(casa2);
		casas.add(casa3);
		
		
		for(Casa i: casas) {
			System.out.println("\nMorada: " + i.getMorada() + "\nPreço de custo: " + i.getPrecoCusto() + "\nPreço de venda: " 
		+i.getPrecoVenda() +"\nMargem de Lucro: " + i.getMargemLucro() + "\nPercentagem de Margem de Lucro: " 
					+ i.getPercentMargemLucro()+"\n");  
		}
				
	}

}
