package practices;

public class Rotate {
	static void Left()
	   {
	       int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	       int N = arr.length;
	      
	       int d = 3;
	       {
	           int p = 1;
	           while (p <= d) {
	               int last = arr[0];
	               for (int i = 0; i < N - 1; i++) {
	                   arr[i] = arr[i + 1];
	               }
	               arr[N - 1] = last;
	               p++;
	           }
	           System.out.println("Print rotate Element: ");

	           for (int i = 0; i < N; i++) {
	        	  
	               System.out.print(arr[i] + " ");
	           }
	       }}
	           public static void main(String[] args) {
	       Rotate.Left();
	   }
}
