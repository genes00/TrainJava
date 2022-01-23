
public class StringPoolTest {

	public static void main(String[] args) {
		String s1,s2,s3,s4;

		s1 = "JAVA";
		
		s2 = "java".toUpperCase();
		
		char ch[] = {'J','A','V','A'};
		s3 = new String(ch).intern();
		
		s4 = new String("JAVA");
		
		System.out.println("Comparing references:");
		System.out.println("Comparing s1 & s2: " + checkStringRef(s1,s2));
		System.out.println("Comparing s1 & s3: " + checkStringRef(s1,s3));
		System.out.println("Comparing s2 & s3: " + checkStringRef(s2,s3));
		System.out.println("Comparing s1 & s4: " + checkStringRef(s1,s4));
		System.out.println("Comparing s3 & s4: " + checkStringRef(s3,s4));
		System.out.println();
		System.out.println("Comparing values:");
		System.out.println("Comparing s1 & s2: " + checkStringVal(s1,s2));
		System.out.println("Comparing s1 & s3: " + checkStringVal(s1,s3));
		System.out.println("Comparing s2 & s3: " + checkStringVal(s2,s3));
		System.out.println("Comparing s1 & s4: " + checkStringVal(s1,s4));
		System.out.println("Comparing s3 & s4: " + checkStringVal(s3,s4));
	}
	
	static boolean checkStringRef(String s1, String s2)
	{
		return s1==s2;
	}
	
	static boolean checkStringVal(String s1, String s2)
	{
		return s1.equals(s2);
	}

}
