package practices;

public class OddPosition {
void Position(int[] a) {
        
        System.out.println("Elements of given array present on odd position: ");  
          
        for (int i = 0; i < a.length; i++) { 
        	if(i%2!=0)
            System.out.println(a[i]);   
        } 

	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr = new int [] {1, 2, 8, 4, 5,7,9,3,6}; 
			OddPosition o1 = new OddPosition();
			o1.Position(arr);
}
}
