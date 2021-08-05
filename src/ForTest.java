
public class ForTest {

	static int a = 0;
	static int b = a++;
	static int c = ++a;
	
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("unconditional cycle");
			i++;
		}
		while(i < 2);
		
		System.out.println(b);
		System.out.println(c);

	}

}
