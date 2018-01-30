package first.pack;

public class TestSchool {
	public static void main(String[] args) {
		
		int grade;
		int score=85;
		
		if (score>=95)
			grade=10;
		else if (score>=85)
			grade=9;
		else if (score>=75)
			grade=8;
		else if (score>=65)
			grade=7;
		else if (score>=55)
			grade=6;
		else
			grade=5;
	
		System.out.println("Nota: "+grade);
		
		
	}
}
