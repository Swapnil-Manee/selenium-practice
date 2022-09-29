package practices;

public class Frequency {
	static void Frequency1(int[] arr) {
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
        int count = 1;  
        for(int j = i+1; j < arr.length; j++){  
        if(arr[i] == arr[j]){  
        count++;
        fr[j] = visited;  
         }  
            }  
        if(fr[i] != visited)  
        fr[i] = count;  
        }  
        System.out.println(" Element | Frequency");  
       
        for(int i = 0; i < fr.length; i++){  
        if(fr[i] != visited)  
         System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }
       public static void main(String[] args) {
// TODO Auto-generated method stub

  int [] a = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
  
  Frequency1(a);

}}



