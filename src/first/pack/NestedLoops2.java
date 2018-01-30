package first.pack;

public class NestedLoops2 {

	public static void main(String[] args) {
		
		int sumPar=0;
		int sumImp=0;
		int counterPar=1;
		int counterImp=1;
		
		for (int i=1;i<=100;i++) {
			if (i%2==0) {
				if (counterPar==3) {			// 3?
					sumPar+=i;
					counterPar=1;			
				}
				
				else counterPar++;
				
			}else {
				if (counterImp==5) {			// 5?
					sumImp+=i;
					counterImp=1;
					
				} else counterImp++;
			}
		}
		
System.out.println("La suma de los números pares es: " +sumPar+", y la suma de los números impares es: "+sumImp+".");
	}

}
// Con 1 en las dos varibles: La suma de los números pares es: 2550, y la suma de los números impares es: 2500.