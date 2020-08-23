package lanchonete;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		menuPrincipal();
	
	}

	private static void menuPrincipal() {
		System.out.println("------------- BEM VINDO AO NOSSO SISTEMA DE DELIVERY -------------");
		System.out.println("\n ------------- MENU -------------");
		System.out.println(" --- [1] Sanduiches           ---");
		System.out.println(" --- [2] Massas               ---");
		System.out.print(" --- [3] Bolos                ---");
		System.out.println("\n --------------------------------\n");
		
		escolhaOmenu();

	}

	public static void escolhaOmenu(){
		 System.out.print("Escolha a sua opção: ");
		 Scanner escolhaMenu = new Scanner(System.in);
		 int resultado = escolhaMenu.nextInt();

		 switch (resultado) {
		case 1:
			System.out.println("Você escolheu Sanduiche");
			break;
		case 2:
			prepararMassa(new Massa());
			break;
		case 3:
			System.out.println("Você escolheu comer Bolos");
			break;
		default:
			System.out.println("Escolha uma opção válida\n");
			escolhaOmenu();
			break;
		}
	}
	
	public static void prepararMassa(Massa massa) {
		System.out.println("\n ------------- TIPO DE MASSA -------------");
		System.out.println(" --- [1] Macarrão                      ---");
		System.out.println(" --- [2] Pizza                         ---");
		System.out.print(" --- [3] Lasanha                       ---");
		System.out.println("\n -----------------------------------------\n");
				
		System.out.print("Escolha sua opção de massa: ");
		 Scanner escolhaMassa = new Scanner(System.in);
		 int resultadoMassa = escolhaMassa.nextInt();
		
		 switch (resultadoMassa) {
		case 1:
			massa.setMassa(TipoMassa.MACARRAO);
			break;
		case 2:
			massa.setMassa(TipoMassa.PIZZA);
			break;
		case 3:
			massa.setMassa(TipoMassa.LASANHA);
			break;
		default:
			System.out.println("Escolha uma opção válida\n");
			prepararMassa(new Massa());
			break;
		}
		 
		System.out.println("\n ------------- TIPO DE MOLHO -------------");
		System.out.println(" --- [1] Branco                        ---");
		System.out.println(" --- [2] Vermelho                      ---");
		System.out.print(" --- [3] Misto                         ---");
		System.out.println("\n -----------------------------------------\n");
		
		escolherMolho(massa);
				 
		 
	}
	
	public static void escolherMolho(Massa massa) {
		System.out.print("Digite sua opção de molho: ");
		Scanner escolhaMolho = new Scanner(System.in);
		 int resultadoMolho = escolhaMolho.nextInt();
		 
		 switch (resultadoMolho) {
		case 1:
			massa.setMolho(TipoMolho.BRANCO);
			break;
		case 2:
			massa.setMolho(TipoMolho.VERMELHO);
			break;
		case 3:
			massa.setMolho(TipoMolho.MISTO);
			break;
		default:
			System.out.println("Escolha uma opção válida\n");
			escolherMolho(massa);
			break;
		}
		 
		System.out.print("Qual a sua distância do restaurante (km)? ");
		Scanner escolhaDistancia = new Scanner(System.in);
		int resultadoDistancia = escolhaDistancia.nextInt();
		massa.calcularTempoDeEntrega(resultadoDistancia);
		 
		System.out.println("\n ------------- RESUMO DO PEDIDO -------------");
		System.out.println(" --- Massa: " + massa.getMassa());
		System.out.println(" --- Molho: " + massa.getMolho());
		System.out.println(" --- Seu pedido chegará em: " + massa.getTempoEntrega() + " minutos");
		System.out.println(" --- TOTAL: R$" + massa.getPreco());
		System.out.println(" --------------------------------------------");

		
		System.out.println("\n ------------- PEDIDO FINALIZADO -------------\n");
		
		System.out.println("\n ------------- NOVO PEDIDO -------------");
		System.out.println(" --- [1] Sim               [2] Não   ---");
		System.out.println(" ---------------------------------------");
		
		System.out.print("Deseja fazer mais algum pedido? ");
		
		Scanner escolhaPedido = new Scanner(System.in);
		int resultadoEscolhaPedido = escolhaPedido.nextInt();

		switch (resultadoEscolhaPedido) {
		case 1:
			menuPrincipal();
			break;
		default:
		System.out.println("\n ------------- OBRIGADO PELA PREFERÊNCIA -------------\n");

		}
	}
	
}
