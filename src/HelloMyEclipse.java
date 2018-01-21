/**
 * @author Leonardo Zhao
 * My First Java Program
 */
public class HelloMyEclipse {

	// Java2 - A Hello World Program
	/**
	 * Hello World
     * author Leonardo Zhao
     * version 版本1.0
     * parm 参数说明
     * return 返回值的含义
     * throws 抛出异常的描述
     * deprecated 废弃，建议用户不再使用该方法 
     * @author Leonardo Zhao
     * @version 1.0
     * @param args default param of main
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print chapter
		System.out.println("\r\n#Java#" + 2 + " " + "A Hello World Program" + "\r\n");
		// System.out.println()
		System.out.println("Hello World!");
		// Semicolons in Java
		System.out.println("I am learning Java!");

		// Java3 - Java Comments
		soloComments(3, "Java Comments");
		
		// Java4 - Variables
		soloVariables(4, "Variables");

		// Java5 - Primitive Operators
		soloPrimitiveOperators(5, "Primitive Operators");
	
		// Java6 - Increment & Decrement
		soloIncrementDecrement(6, "Increment & Decrement");

		// Java7 - Strings
		soloStrings(7, "Strings");

		// Java7 - 
	}

	// Java3 - Java Comments
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloComments(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub

		//This is a single-line comment
		int x = 5;//a single-line comment after code

		/* This is also a
		comment spanning
		multiple lines*/
		
		/* This is a single-line comment:
		// a single-line comment
		 */

		/** This is a documentation comment
		 */
		
		/** This is also a 
		 documentation comment */

		/**************************************
		This is the start of a method
		**************************************/

		x = x * iChapter;

		return;
	}

	// Java4 - Variables
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloVariables(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub

		String name = "David";
		int age = 42;
		double score = 15.9;
		char group = 'Z';
		boolean online = true;
		int a = 42, b = 11;

		return;
	}
	

	// Java5 - Primitive Operators
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloPrimitiveOperators(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
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

		return;
	}
	
	// Java6 - Increment & Decrement
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloIncrementDecrement(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int test1 = 5;
		++test1; 
		System.out.println(test1);
		
		int test2 = 5;
		--test2;
		System.out.println(test2);

		return;
	}
	
	// Java7 - Strings
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloStrings(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		String s = "SoloLearn";
		
		String firstName, lastName;
		firstName = "David";
		lastName = "Williams";
		System.out.println("My name is " + firstName + " " + lastName);
		
		return;
	}


	// Java3 - Java Comments
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	/*
	public static void soloComments(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub

		return;
	}
	*/
}
