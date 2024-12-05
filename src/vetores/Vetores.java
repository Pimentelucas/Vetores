package vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		int numeros[] = {2,5,1,3,4,9,7,8,10,6}, num, contador = 0;
			
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(numeros[i] == num ) {
				contador++;
				System.out.println("O número "+ num + " está localizado na posição "+ i);
			}
			
		}
		if(contador == 0) {
			System.out.println("O número "+ num + " não foi encontrado!");
		}
	
	}

}
