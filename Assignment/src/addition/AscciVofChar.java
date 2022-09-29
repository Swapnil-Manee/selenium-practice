package addition;

public class AscciVofChar {

	public static void main(String[] args) {
//*********************** Ascci value of char ***********************************
    char ch = 'B';
    int n = ch;
	System.out.println("Ascci value of "+ch+" will be "+n);
	//************************ Find ascii value from A to Z ***************************
	char CapitalChar = 'A';
	char SmallChar = 'a';
 for (int i = 'A'; i<='Z'; i++) {
	System.out.println(CapitalChar +" : "+i);
		CapitalChar++;  
 }
 //**********************Find ascii value from a to z *****************************
 for (int i = 'a'; i <= 'z'; i++) {
     System.out.println(SmallChar + " : " + i);
     SmallChar++;
	}
}
}