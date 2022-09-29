package forloop;

public class NestedForLoop3 {

	public static void main(String[] args) {
		// java for loop inside the while loop
		int weeks = 3;
	    int days = 7;
	    int i = 1;

	    // outer loop
	    while (i <= weeks) {
	      System.out.println("Week: " + i);

	      // inner loop
	      for (int j = 1; j <= days; ++j) {
	        System.out.println("  Days: " + j);
	      }
	      ++i;
	    }
	  }
	}
/*It is possible to use one type of loop inside the body of another loop. For example,
we can put a for loop inside the while loop.
Here you can see that the output of both Example 1 and Example 2 is the same.*/
