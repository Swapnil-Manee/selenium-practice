package practices;

public class PrintSum {
	static void Sum(int[] b) {
        int sum = 0;  
        for (int i = 0; i < b.length; i++) {  
           sum = sum + b[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);
	}

                public static void main(String[] args) {
	// TODO Auto-generated method stub

    int [] c = new int [] {1, 6, 3, 4, 5,15}; 
   
    PrintSum.Sum(c);
    
}
}
