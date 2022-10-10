package br.com.erickfreire.comparandointeiros;

import java.util.Scanner;

public class ComparandoInteiros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Programa que compara dois valores: ");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2)
			System.out.printf("O primeiro valor %d é maior! %n", numero1);
		
		if(numero1 < numero2)
			System.out.printf("O segundo valor %d é maior! %n", numero2);
		
		if(numero1 == numero2)
			System.out.printf("Os números %d e %d são iguais! %n", numero1, numero2);

	}

}
