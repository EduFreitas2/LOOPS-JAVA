package javaExerciciosDia8;
import java.util.Scanner;
public class javaEx1For {
public static void main(String[] args) {
	
	Scanner read = new Scanner(System.in);
	
	int numero1, numero2;
	int contador = 0;
	System.out.println("Digite o valor do primeiro número do intervalo");
	numero1 = read.nextInt();	
	System.out.println("Digite o valor do segundo número do intervalo");
	numero2 = read.nextInt();		
	
	if(numero1 > numero2) {
		System.out.println("****INTERVALO INVÁLIDO!!****");
	}
	else {
		for(int i = numero1; i < numero2; i++)
		{
			if(i%15 == 0) {
				System.out.println("O número " + i + " é múltiplo de 3 e 5.");
				i +=14;
				contador = contador + 1;
			}		
		}
		if(contador == 0)
			System.out.println("\nNão há múltiplos de 3 e 5 no intervalo de " + numero1 + " a " +numero2);	
	}
}
}
