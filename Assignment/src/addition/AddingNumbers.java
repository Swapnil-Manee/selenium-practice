package addition;

public class AddingNumbers {

	public static void main(String[] args) {
		// program to add two integers
    int a = 15;
    int b = 20;
    int result = a + b;
    multi (28,10);
    division (2,10);
    System.out.println("xxxv = "+ result);
	
	AddingNumbers s1 = new AddingNumbers();
	s1.subtraction();
	}
	public void subtraction() {
		int d = 10;
    int f = 20;
    int g = d - f;
    
    System.out.println("result = "+ g); 
  
  }

	public static void multi(int j, int k) {
		//int j = 28;
		//int k = 10;
		int res = j * k;
		 System.out.println("result = "+ res); 
	}	
	public static void division (int p, int m) {
		int result = p / m;
		System.out.println("result = "+ result);

	}
	}