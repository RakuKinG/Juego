package Juego1;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿En que siglo se inventó la catapulta?");
		
		System.out.println("100 d de C (1)");
		System.out.println("500 a de C (2)");
		System.out.println("400 a de C (3)");
		System.out.println("197 d de C (4)");
		
		String opcion = sc.nextint();
		sc.nextLine();
		
		if(opcion==3){
			System.out.println("Correcto!");
		}else{
			System.out.println("Incorrecto!");
		}
		System.out.println("FIN");
	
	}
	
}
