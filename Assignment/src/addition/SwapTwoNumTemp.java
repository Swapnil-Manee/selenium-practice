package addition;

public class SwapTwoNumTemp {

	public static void main(String[] args) {
		// swap two numbers using temporary variable
    int abhi = 20;
    int kishor = 30;
    System.out.println("abhi value before swapping:" + abhi);
    System.out.println("kishor value before swapping:" + kishor);
	
// now applying the logic to swap this two number,we are going to take temp variable
    int temp = abhi;
    abhi = kishor;
    kishor = temp;
    
   // System.out.println(temp);
    //System.out.println(abhi);
   
    System.out.println("abhi value after swapping:" + abhi);
    System.out.println("kishor value after swapping:" + kishor);
}
}
