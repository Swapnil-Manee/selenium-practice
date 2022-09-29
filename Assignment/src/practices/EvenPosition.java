package practices;

public class EvenPosition {

    static void Even(int[] arr) {
       System.out.println("Elements of given array present on even position: ");  
       
       for (int i = 0; i < arr.length; i++) { 
       	if(i%2==0)
           System.out.println(arr[i]);  
       } 
}
   public static void main(String[] args) {
// TODO Auto-generated method stub
int [] arr1 = new int [] {1, 3, 6, 4, 5,8,9}; 
EvenPosition.Even(arr1);

}
}
