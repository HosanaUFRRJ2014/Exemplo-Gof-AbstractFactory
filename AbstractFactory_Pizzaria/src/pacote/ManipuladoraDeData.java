package pacote;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author hosana
 * Esta classe é responsável por manipular as operações envolvendo datas
 * que o sistema utiliza.
 */
public class ManipuladoraDeData {

	/**
	 * Método responsável por capturar a data registrada do relógio computador.
	 * @return dataAtual String
	 */
	public static String getDataAtual()
	{
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return formatador.format(date);
	}

	
	/**
	 * Método responsável por converter a entrada de teclado do usuário em uma
	 * data do tipo Date.
     * @param 
	 * @return data Date	
	 */
	public static Date converterStringParaDate(String entrada) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  

		Date data;
		try {
			data = formatador.parse(entrada);
			return data;
		} catch (ParseException e) {
			System.out.println("Data no formato incorreto. Por favor, 	"
					+ "informe a data no formato dd/mm/yyyy");

			//System.out.println("Log do erro:" + e.getMessage());
			return null;
		}  


	}

	/**
	 * Método responsável por, dado uma data, verificar um qual o dia da semana a 
	 * data ocorreu/ocorrerá.
	 * <br> Tabela de equivalências:
	 * <br> Domingo =	0
	 * <br> Segunda =	1
	 * <br> Terça =		2
	 * <br> Quarta =	3
	 * <br> Quinta =	4
	 * <br> Sexta =		5
	 * <br> Sábado =	6
	 * 
	 * @param data
	 * @return dia da semana expresso em número (int).
	 * @see     java.util.Date
	 */
	@SuppressWarnings("deprecation")
	public static int verificarDiadaSemana(Date data)
	{
		//return data.getDay();
		return data.getDay();
	}

	/**
	 * Método responsável por, a partir do dia da semana (Date), descobrir
	 * qual dos cozinheiros estará trabalhando. 
	 * @param data
	 * @return Cozinheiro ou null, caso o dia seja um domingo.
	 */
	public static Cozinheiro descobrirCozinheiroDodia(Date data)
	{
		Cozinheiro cozinheiro = null;
		int diaDaSemana = verificarDiadaSemana(data);

		switch(diaDaSemana)
		{
		case 1:
		case 3:
		case 5:
			cozinheiro = new Cozinheiro1();
			break;
		case 2:
		case 4:
		case 6:
			cozinheiro = new Cozinheiro2();
			break;
		case 0:
			break;

		}

		return cozinheiro;
	}
}
