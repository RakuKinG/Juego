package Juego1;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		/**
		 * @author MOrihuela
		 */
		
		
		System.out.println("¿En que siglo se inventó la catapulta?");
		
		System.out.println("100 d de C (1)");
		System.out.println("500 a de C (2)");
		System.out.println("400 a de C (3)");
		System.out.println("197 d de C (4)");
		
		int opcion=Eleccion();
		
		Correctooincorrecto(opcion);
		
		
	
	}
	/**
	 * numero entero que es la opcion
	 * @return
	 */
	static int Eleccion(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
		
	}
	/**
	 * recibe la opcion introducida anteriormente y la usa para saber si es correcto o no
	 * @param opcion
	 */
	static void Correctooincorrecto(int opcion){
		if(opcion==3){
			System.out.println("Correcto!");
		}else{
			System.out.println("Incorrecto!");
		}
		System.out.println("FIN");
	};
	
}
