package week2.day1;

public class ConditionalStatementsIfElseCase {

	public static void main(String[] args) {
		int score = 67;
		
		if (score>=90) {
			System.out.println("The grade is S");
		}else if(score>=80){
			System.out.println("The grade is A");
		}else if(score>=70){
			System.out.println("The grade is B");
		}else if(score>=60){
			System.out.println("The grade is C");
		} else {
            System.out.println("The grade is D");
		}

	}

}
