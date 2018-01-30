package first.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JavaIO {

	public static void main(String[] args) throws IOException {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre:");
		String name=in.readLine();
		System.out.println("Tu nombre es "+name);
		System.out.println("Peso: ");
		int height=Integer.parseInt(in.readLine());
		System.out.println("Tu peso es "+height);
		
		
	}

}
//Error: no se ha encontrado el método principal en la clase first.pack.JavaIO, defina el método principal del siguiente modo:\n   public static void main(String[] args)\nde lo contrario, se deberá ampliar una clase de aplicación JavaFX javafx.application.Application