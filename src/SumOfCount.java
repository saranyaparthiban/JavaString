
public class SumOfCount {
	
	public static void main(String[] args) {
		int n = 200;
		int i = 0; int sum = 0;
		while (n>0) {
		i = n%10;
		sum = sum + i;
		n=n/10;
		
	}
System.out.println(sum);
}




}
