import java.util.HashMap;

public class Hash {

     public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("A", 1);
		h.put("B", 2);
		h.put("A", 3);
		
		System.out.println(h);
	}

}
