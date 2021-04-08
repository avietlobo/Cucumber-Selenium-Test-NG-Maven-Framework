package utilities;

public class Test {

	public static void main(String[] args) {
		String foo=Test.class.getResource("config/config.properties").toString();
		System.out.println(foo);
		
	}

}
