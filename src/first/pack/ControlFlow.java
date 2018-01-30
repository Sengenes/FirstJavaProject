package first.pack;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		if (a<11) {
			System.out.println("A es menor que 10");
		}
		
			else {
				System.out.println("A no es menor que 10");
				}
		int b=15;
		if (b==13)
			System.out.println("B=13");
		else if ((b<=17)&&(b>=12))
			System.out.println("B es menor o igual a 17 y mayor o igual a 12");
		else
			System.out.println("B no es ninguna de las opciones");
	}

}
