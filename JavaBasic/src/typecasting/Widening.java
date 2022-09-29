package typecasting;
//Example: Converting int to double

public class Widening {
	public static void main(String[] args) {
	    // create int type variable
	    int num = 10;
	    System.out.println("The integer value: " + num);

	    // convert into double type
	    double data = num;
	    System.out.println("The double value: " + data);
	  }
	}
/* In the above example, we are assigning the int type variable named num to
 *  a double type variable named data.Here, the Java first converts the int type 
 *  data into the double type. And then assign it to the double variable. In the case of 
 *  Widening Type Casting, the lower data type (having smaller size) is converted 
 *  into the higher data type (having larger size). Hence there is no loss in data. 
 *  This is why this type of conversion happens automatically.

Note: This is also known as Implicit Type Casting.*/
