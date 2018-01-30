package first.pack;

import java.io.IOException;
import java.util.Scanner;

public class ScannerClass {

		public static void main(String[] args) throws IOException {
		
		String nombre;
		int peso;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar nombre");
		nombre= sc.nextLine();
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Ingresar peso: ");
		peso=sc.nextInt();
		System.out.println("Tu peso es: "+peso);
		sc.close();
		
	}

}
//Error: no se ha encontrado el método principal en la clase first.pack.Scanner, defina el método principal del siguiente modo:\n   public static void main(String[] args)\nde lo contrario, se deberá ampliar una clase de aplicación JavaFX javafx.application.Application