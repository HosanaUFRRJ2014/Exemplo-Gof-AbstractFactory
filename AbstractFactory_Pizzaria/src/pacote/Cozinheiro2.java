package pacote;

/**
 * @author hosana
 * @ Concrete Factory 2
 */
public class Cozinheiro2 implements Cozinheiro {
		
	@Override
	public Pizza fazerPizza() {
		PizzaPresunto pizza = new PizzaPresunto();

		return pizza;
	}

	@Override
	public Calzone fazerCalzone() {
		CalzonePresunto calzone = new CalzonePresunto();
		return calzone;
	}


}
