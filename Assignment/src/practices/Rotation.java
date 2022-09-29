package practices;

public class Rotation {
	public static void rotateRight()   
	{ 
	 
		int array[] = { 12, -9, 45, 23, -99, 67, 98, 90, 11, 45};   
	 
		int r = 3;  
		 
		int n = array.length;  
		System.out.println("Array before rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
		System.out.print(array[i]+ " ");   
		}  
		  
		System.out.println("\nArray after right rotation: ");   
		for(int i = 0 ; i < n ; i++)  
		{  
	     
		System.out.print(array[i] + " ");  
		}  
	}   
	public static void main(String args[])   
	{   
    rotateRight();
	} 
}
