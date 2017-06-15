/**
 * 
 */
package pacote;

/**
 * @author hosana
 * @ Concrete Factory 1
 */
public class Cozinheiro1 implements Cozinheiro {
	

	
	@Override
	public Pizza fazerPizza() {
		PizzaCalabreza pizza = new PizzaCalabreza();

		return pizza;
	}

	@Override
	public Calzone fazerCalzone() {
		CalzoneCalabreza calzone = new CalzoneCalabreza();
		return calzone;
	}


	
	
}
