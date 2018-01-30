package first.pack;
//import java.lang.String; // ? con esto se va el error.
public class SubString {
	public static void main(String[] args) {

		String s="This is some text";
		String s1=s.substring(0,5);		// Si fuera (1,5) empezaría a contar desde la h, y el resultado es: Does not start
		
		if (s.startsWith(s1))
			System.out.println("Starts with character from s1");
		else
			System.out.println("Does not start");
		
		String s2="Some text";
				System.out.println(s2.substring(5));
				
		if (s.contains("text"))
			System.out.println("String s contains 'text'");
		else
			System.out.println("Does not contain");
		
		String name1="Ana";
		String name2="Ara";
//La comparación con el 0 y los términos antes y después tienen que ver con el órden alfabético? Si invierto los datos de las variables, el resultado es After.
		if (name1.compareTo(name2)>0)
			System.out.println("After");
		else if (name1.compareTo(name2)<0)
			System.out.println("Before");
		else
			System.out.println("Same");
		
	}

}
