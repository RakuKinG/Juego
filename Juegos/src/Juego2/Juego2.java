package Juego2;

import java.util.Scanner;

public class Juego2 {
	public static class HolaMundo {

		public static void main(String[] args) {		
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una palabra y le daremos la vuelta");
			String palabra =sc.nextLine();
			System.out.println("esta palabra se ha guardado:  "+palabra);
			System.out.println("ahora intenta escribir esa palabra al reves" );
			String palabra2 =sc.nextLine();
			System.out.println("has introducido: "+palabra2);
			
		    
			for (int x=palabra.length()-1;x>=0;x--)
				palabra = palabra +palabra.charAt(x);
		    	System.out.println(palabra);
		    
		}

	}
}
