package forloop;

public class NestedForLoop2 {
	public static void main(String[] args) {
	   int weeks = 3;
	    int days = 7;

	    // outer loop prints weeks
	    for (int i = 1; i <= weeks; ++i) {
	      System.out.println("Week: " + i);

	      // inner loop prints days
	      for (int j = 1; j <= days; ++j) {
	        System.out.println("  Day: " + j);
	      }
	    }
}
}
/*In the above example, the outer loop iterates 3 times and prints 3 weeks.
And, the inner loop iterates 7 times and prints the 7 days.
We can also create nested loops with while and do...while in a similar way.
Note: It is possible to use one type of loop inside the body of another loop. 
For example, we can put a for loop inside the while loop.*/