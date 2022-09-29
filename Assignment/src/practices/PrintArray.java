package practices;

public class PrintArray {
	static void Print() {
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");  
  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }

       	public static void main(String[] args) {
       		// TODO Auto-generated method stub
       		PrintArray.Print();
	}
}
