package javaExerciciosDia8;
import java.util.Scanner;
public class javaEx1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner read = new Scanner(System.in);
			int idade = 0, idade50 = 0, idade21 = 0;
			while (idade >= 0) {
				System.out.println("Digite a idade da pessoa: ");
				idade = read.nextInt();
				
				if(idade > 0 && idade < 21) {
					idade21 += 1;					
				}
				else if(idade > 51)
				{
					idade50 += 1;
				}
				
			}
			System.out.println("\nTotal de pessoas menores de 21 anos: " +idade21);
			System.out.println("\nTotal de pessoas maiores de 50 anos: " +idade50);
	}

}
