package pacote;

import java.util.Date;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String entrada;

		System.out.println("Bem vindo ao sistema de requisição de pizza/calzone!\n");

		
		loopMaisExterno:
		do{

			Date data = null;

			do{
				System.out.println("\nInforme uma data no formato dd/mm/yyyy. 	"
						+ "Exemplo de entrada: "+ ManipuladoraDeData.getDataAtual());
				System.out.println("ou digite 'q' ou 'quit' para sair");
				entrada = scan.next();

				if(entrada.equalsIgnoreCase("quit") || entrada.equalsIgnoreCase("q"))
					break loopMaisExterno;

				data = ManipuladoraDeData.converterStringParaDate(entrada);
			}while(data == null);

			Cliente cliente = new Cliente();
			Cozinheiro cozinheiro = null;

			cozinheiro = ManipuladoraDeData.descobrirCozinheiroDodia(data);

			if(cozinheiro == null)
			{
				System.out.println("A pizzaria/calzonaria está fechada.	"
						+ "Por favor, retorne num dia entre segunda a sexta.");
			}

			else
			{
				cliente.pedirPizza(cozinheiro);
				cliente.pedirCalzone(cozinheiro);
			}


		}while(true);

		System.out.println("Você saiu do sistema com sucesso.");
		scan.close();

	}



}
