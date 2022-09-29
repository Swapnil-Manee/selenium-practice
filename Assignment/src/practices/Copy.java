package practices;

public class Copy {
static void CopyArray(int[] array1) {
		
		int array2[] =new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}
		System.out.println("Elements of original array:");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]+ "");
		}
		System.out.println();
			
			System.out.println("Elements of array2");
			for(int i=0; i<array2.length;i++) {
				System.out.println( array2[i]+"");
			
			}}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int[] array= new int[]{10,20,30,40,50};
				Copy.CopyArray(array);
				
		}
	 
}
