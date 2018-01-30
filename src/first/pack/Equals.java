package first.pack;

public class Equals {

	public static void main(String[] args) { 

		String a1="Angeles";
		String a2="angeles";
		
		if (a1.equals(a2))
			System.out.println("Cadenas a1 y a2 son similares");
		else
			System.out.println("Cadenas a1 y a2 no son similares");
		
		if (a1.equalsIgnoreCase(a2))
			System.out.println("Cadenas a1 y a2 son similares");
		else
			System.out.println("Cadenas a1 y a2 no son similares");
		
		System.out.println("esto es una cadena".toUpperCase());
		
	}

}
