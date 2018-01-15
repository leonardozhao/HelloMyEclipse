/**
 * This is a documentation comment
 */

/**
 * @author z00211056
 *
 */
public class HelloMyEclipse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * This is a documentation comment
		 */
		
		//This is a single-line comment
		int x = 5;//a single-line comment after code

		//Variables
		String name = "David";
		int age = 42;
		double score = 15.9;
		char group = 'Z';
		boolean online = true;
		int a = 42, b = 11;

		/* This is also a
		comment spanning
		multiple lines*/
		System.out.println("\r\nHello World!\r\n");

		System.out.println("I am learning Java!\r\n");

		//Java 5: Primitive Operators
		int y = 6 + 3;
		
		int sum1 = 50 + 10;
		int sum2 = sum1 + 66;
		int sum3 = sum1 + sum2;
		System.out.println("sum1 = " + sum1 + ", sum2 = " + sum2 + ", sum3 = " + sum3 );
		
		sum1 = 1000 - 10;
		sum2 = sum1 - 5;
		sum3 = sum1 - sum2;
		System.out.printf("sum1 = %d, sum2 = %d, sum3 = %d\r\n", sum1, sum2, sum3);
		
		sum1 = 1000 * 2;
		sum2 = sum1 * 10;
		sum3 = sum1 * sum2;
		System.out.format("sum1 = %d, sum2 = %d, sum3 = %d\r\n", sum1, sum2, sum3);
		
		sum1 = 1000 / 5;
		sum2 = sum1 / 2;
		sum3 = sum1 / sum2;
		System.out.format("sum1 = %d, sum2 = %d, sum3 = %d\r\n", sum1, sum2, sum3);
		
		int value = 23;
		int quotient = value / 6;
		int res = value % 6;
		System.out.format("value = %d, quotient = %d, res = %d\r\n", value, quotient, res);
	}

	/**************************************
	This is the start of a method
	**************************************/

}
