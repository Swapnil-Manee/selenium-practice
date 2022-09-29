package practices;

public class Small {
	public static int SecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		public static void main(String args[]){  
	 
		int b[]={44,66,99,77,33,22,55};  
	  
		System.out.println("Second smallest: "+SecondSmallest(b,7));  
		}}  


