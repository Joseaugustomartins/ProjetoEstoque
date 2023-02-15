package Aplicacao;

import java.util.Scanner;

import Estoque.estoque;

public class TelaPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		estoque estoque = new estoque();
		
		System.out.println("----- ESTOQUE ------");
		System.out.println();
		System.out.print("Nome: ");
		estoque.name = sc.nextLine();
		System.out.print("Quantidade: ");
		estoque.quantidade = sc.nextInt();
		System.out.print("Preço: ");
		estoque.valor = sc.nextDouble();
		
		System.out.print("Quer continuar? (1- S / 2 -N): ");
		int resposta = sc.nextInt();
		
		if(resposta == 1) {
			System.out.println();
			System.out.print("Qual o nome do produto que você quer adcionar: ");
			estoque.name = sc.nextLine();
		}
		else {
			System.out.println();
			System.out.println(estoque);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
