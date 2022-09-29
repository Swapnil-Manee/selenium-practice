package addition;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		
		//check if a number is positive or negative using if else statement

    double num =256;
		
		if(num >0.0)
		{
			System.out.println(num +" is a positive num");
		}
		else if(num < 0.0) {
			System.out.println(num +" is a negative num");
		}else {
			System.out.println(num +" is 0");
		}
	}

}
