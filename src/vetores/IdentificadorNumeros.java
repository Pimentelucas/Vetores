package vetores;

import java.util.Scanner;

public class IdentificadorNumeros {

	public static void main(String[] args) {
		
		int num[] = new int[10],  valor = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira um valor: ");
			num[i] = leia.nextInt();
			valor = num[i] + valor;
		}
		System.out.println("Elementos nos índices ímpares: ");
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.print(num[i]+" ");
			}
		}
		System.out.println("\nElementos pares: ");
		
		for(int i = 0; i < 10; i++) {
			if(num[i] % 2 == 0) {
				System.out.print(num[i]+" ");
			}
		}
		System.out.println("\nSoma: "+ valor);
		System.out.println("Média: "+ valor / 10);
	}

}
