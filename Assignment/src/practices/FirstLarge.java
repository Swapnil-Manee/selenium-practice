package practices;

public class FirstLarge {
	public static int ThirdLargest(int[] a, int total){  
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
		       return a[total-1];  
		}  
		public static void main(String args[]){  
		int a[]={12,34,5,6,3,2,10};  
		 
		System.out.println("Third Largest: "+ThirdLargest(a,6));  
		 
		}
}
