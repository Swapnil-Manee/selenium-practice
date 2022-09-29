package practices;

public class LargestElement {
	 void Element() {
	        int [] arr = new int [] {25, 11, 7, 75, 56};  
	               int max = arr[0];  
	       
	        for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);

		}

	    	public static void main(String[] args) {
	    		// TODO Auto-generated method stub
	        
	    		LargestElement l1 = new LargestElement();
	    		l1.Element();
	}
	    	}


