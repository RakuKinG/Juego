package Juego3;

public class Juego3 {
	public static void main(String[] args) {

 try (Scanner sc = new Scanner(System.in)) {
	int a = (int) ((Math.random() * 100)+1); // Número random del 1 a 100.
	 int b; // Número introducido por el usuario.
	 int i; // Contador.
	
	 System.out.println("El juego consiste en adivinar un número de 1 al 100.");
	
	 System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 100: ");
	 b = sc.nextInt();
	
	 for (i=0; i<=4; i++) { 
	
	    /*Evaluación si se ha acertado.*/
	    
	    if (a == b) {  
	      System.out.println("¡Has adivinado!"); 
	      break; } 
	    
	    /*Si no consigue adivinar con 5 intentos*/
	    
	    else if (i == 4) { 
	      System.out.println("¡has perdido!. El número era el: " + a); 
	      break; } 
	    
	    // Si no es ninguno de los casos anteriores, comparamos números.
	    
	    else if (a > b) 
	      System.out.println("El número es MAYOR que " + b);
	    else if (a < b)
	      System.out.println("El número es MENOR que " + b);
	
	    // Para dar una pista y avisarte si es la última oportunidad.
	    
	    if (i <=1) { 
	     System.out.print("Otro intento: "); 
	     b = sc.nextInt(); } 
	    else if (i ==2) { 
	    int x = (int) (a/10);
	    System.out.println("Una pista, la primera cifra es " + x);
	    System.out.print("Inténtalo de nuevo: ");
	    b = sc.nextInt(); } 
	   else if (i >= 3) {
	   System.out.print("ÚLTIMO intento: ");
	   b = sc.nextInt(); }
	    }
}
  }
}
