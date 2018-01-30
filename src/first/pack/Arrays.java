package first.pack;
public class Arrays {
	public static void main(String[] args) {

		//int a[];
		//a=new int [5];
		//int a[] = new int[5];
		//int [] a= new int[5];
		//int a[]= {1,2,3,4,5};
//Descomentados devuelven error porque se está declarando la misma variable con el mismo valor más de una vez?
		
		//int [][]a= {{1,2,3},{4,5,6}};
/*		
		int array[]= {1,3,5,7,9};
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		int array2[]= {2,4,6,8,10};
		for (int i:array2) {
			System.out.println(i);
*/
			int[][] a = { {1, 2, 3},{4, 5, 6} };			
			for (int i=0;i<a.length; i++) {
				for (int j=0;j<a[i].length;j++) {
					System.out.println(a[i][j]);
				}
				System.out.println();
			}
				
		}
	}

/*
 * Error: no se ha encontrado el método principal en la clase first.pack.Arrays, defina el método principal del siguiente modo:
 * \n   public static void main(String[] args)\n de lo contrario, se deberá ampliar una clase de aplicación JavaFX javafx.application.Application
 */