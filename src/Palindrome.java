
public class Palindrome {
	
public static void main(String[] args) {
	
	int n = 141;
	
	int i = 0; int j = 0; int a ;
	
	       a = n;
	       
	       while (a>0) {
	    	   i = a%10;
	    	   j = (j*10)+i;
	    	   a=a/10;
	           }
	       if (j==n) {
	    	   System.out.println("n is palindrome");
			
		}
	       else {
	    	   System.out.println("n is not palindrome");
	       }

}
}