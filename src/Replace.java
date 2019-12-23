
public class Replace {

public static void main(String[] args) {
		String S = "ABCF123654";
		boolean c = S.contains("AB");
		
		String r = S.replace("AB", "XX");
		System.out.println(r);
		System.out.println(c);
		
	}

}
