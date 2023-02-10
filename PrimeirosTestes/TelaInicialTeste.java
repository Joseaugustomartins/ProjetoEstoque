import java.util.Scanner;
public class TelaInicialTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- Estoque -----");
		System.out.println("1 - VER ESTOQUE");
		System.out.println("2 - ATUALIZAR ESTOQUE");
		System.out.println("3 - SAIR");
		System.out.print("ESCOLHA A OPÇÃO QUE VOCÊ DESEJA: ");
		int esc = sc.nextInt();
		
		while(esc != 3) { // Até aqui está tudo certo
			while(esc == 1) {
				System.out.println();
				System.out.println("Estoque"); // aqui vai ter um pacote  sobre o estoque
				System.out.println("Digite 1 para ver cada divisão"); // aqui também vai ter um pacote especifico 
				System.out.println("Digite 2 para voltar");
				System.out.print("Sua opção: ");
				int ope = sc.nextInt();
				if (ope == 1) {
					System.out.println("Estoque"); // aqui ta quebrado e ainda não sei como resolver 
				}
				else {
					System.out.println();
				}
				
				
				/* int ope;
				do {
					System.out.println("-- Estoque --");
					System.out.println("Digite 1 pra ver cada divisão");
					System.out.println("Digite 2 para sair");
					System.out.print("Sua  opção: ");
					ope = sc.nextInt();
				} while(ope != 2);*/                   // Não funciona assim
			}
			    
			
			
			
			
			
			
			
			
			if (esc == 2) {
				System.out.println("1 - ADCIONAR");
				System.out.println("2 - RETIRAR");
				System.out.println("3 - VOLTAR A PAGINA PRINCIPAL"); // tem que criar um pacote e finalizar esse if
				
			}
		}
		
		
		System.out.println("Muito obrigado! Até Breve");
		
		sc.close();
	}

}
