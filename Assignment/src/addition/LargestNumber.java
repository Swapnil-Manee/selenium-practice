package addition;

public class LargestNumber {

	public static void main(String[] args) {
		
		// find largest among three numbers using if else statment

    int a = 54, b = 26, c = 70;
		
		if(a>b && a>c)
		{
			System.out.println("A is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is largest");
		}else
		{
			System.out.println("C is largest");
		}
	}

}
