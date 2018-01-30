package first.pack;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<10;i++) {
			if (i==7) {
				break;
			}
			
			if (i==2)
				continue;
			System.out.print(i+" ");
		}

	}

}
