package addition;

public class Ascii {

	public static void main(String[] args) {
		// find ascii value from A to Z
  char ch ='A';
   int n = ch;
   System.out.println("Ascii value of "+ch+" will be "+n);
	

     char CapitalChar = 'A';
     char SmallChar = 'a';
      for (int i = 'A'; i<='Z'; i++) {
    	System.out.println(CapitalChar +" : "+i);
    		CapitalChar++;  
    	}
	} 
}