package pacote;

/**
 * 
 * @author hosana
 * Client
 */
public class Cliente 
{
	
	public void pedirPizza(Cozinheiro cozinheiro)
	{
		System.out.println("Cliente pediu uma pizza.");
		Pizza pizza = cozinheiro.fazerPizza();
		pizza.informarSabor();
	}
	
	public void pedirCalzone(Cozinheiro cozinheiro)
	{
		System.out.println("Cliente pediu um calzone.");
		Calzone calzone = cozinheiro.fazerCalzone();
		calzone.informarSabor();
	}

}
