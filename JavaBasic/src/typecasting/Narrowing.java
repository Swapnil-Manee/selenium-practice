package typecasting;
//Example: Converting double into an int
public class Narrowing {
	public static void main(String[] args) {
	    // create double type variable
	    double num = 10.99;
	    System.out.println("The double value: " + num);

	    // convert into int type
	    int data = (int)num;
	    System.out.println("The integer value: " + data);
	  }
}
/* In the above example, we are assigning the double type variable named num to
 *  an int type variable named data.Notice the line,int data = (int)num;
Here, the int keyword inside the parenthesis indicates that that the num
 variable is converted into the int type.In the case of Narrowing Type Casting,
  the higher data types (having larger size) are converted into lower data types 
  (having smaller size). Hence there is the loss of data. This is why this type of
   conversion does not happen automatically.
   Note: This is also known as Explicit Type Casting.*/

