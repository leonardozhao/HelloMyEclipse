// Java8 - Getting User Input
import java.util.Scanner;

/**
 * @author Leonardo Zhao
 * My First Java Program
 */
public class HelloMyEclipse {
	// Java8 - Getting User Input
	final static Scanner scanner=new Scanner(System.in);

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
		Runtime.getRuntime().addShutdownHook(new Thread() {
		    @Override
		    public void run() {
		        scanner.close();
		    }
		});

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

		// Java8 - Getting User Input
		soloGettingUserInput(8, "Getting User Input");
		
		// Java9 - Getting User Input
		soloConditionalStatements(9, "Conditional Statements");

		// Java10 - Getting User Input
		soloNestedIfStatements(10, "Nested if Statements");
		
		// Java11 - Getting User Input
		soloElseIfStatement(11, "else if Statement");

		// Java12 - Getting User Input
		soloLogicalStatements(12, "Logical Statements");

		// Java13 - Getting User Input
		soloTheSwitchStatement(13, "The switch Statement");

		// Java14 - Getting User Input
		soloWhileLoops(14, "While Loops");

		// Java15 - Getting User Input
		soloForLoops(15, "For Loops");

		// Java16 - Getting User Input
		soloDoWhileLoops(16, "do while Loops");

		// Java17 - Getting User Input
		soloArrays(17, "Arrays");

		// Java18 - Getting User Input
		soloSummingElementsInArrays(18, "Summing Elements in Arrays");

		// Java19 - Getting User Input
		soloEnhancedForLoop(19, "Enhanced for Loop");

		// Java20 - Getting User Input
		soloMultidimensionalArrays(20, "Multidimensional Arrays");

		// Java7 - 
		
		// print The End
		System.out.println("\r\nThe End");
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
		System.out.println("Increment of 5 is " + test1);
		
		int test2 = 5;
		--test2;
		System.out.println("Derement of 5 is " + test2);
		
		int x = 0, y = 0;
		
		x = 34;
		y = ++x;
		System.out.println("x = " + x + "; y = " + y + ";");

		x = 34;
		y = x++;
		System.out.println("x = " + x + "; y = " + y + ";");

		int num1 = 0, num2 = 0;
		num1 = 4;
		num2 = 8;
		num2 += num1;
		System.out.println("num1 = " + num1 + "; num2 = " + num2 + ";");
		
		num1 = 4;
		num2 = 8;
		num2 -= num1;
		System.out.println("num1 = " + num1 + "; num2 = " + num2 + ";");

		num1 = 4;
		num2 = 8;
		num2 *= num1;
		System.out.println("num1 = " + num1 + "; num2 = " + num2 + ";");
		
		num1 = 4;
		num2 = 8;
		num2 /= num1;
		System.out.println("num1 = " + num1 + "; num2 = " + num2 + ";");

		num1 = 4;
		num2 = 8;
		num2 %= num1;
		System.out.println("num1 = " + num1 + "; num2 = " + num2 + ";");

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

	// Java8 - Getting User Input
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloGettingUserInput(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		//Scanner myVar = new Scanner(System.in);
		System.out.println("Please input a sentence that you want to say most:");
		//System.out.println(myVar.nextLine());
		System.out.println(scanner.nextLine());

		/*System.out.println("Your lucky number is:");
		System.out.println(myVar.nextInt());*/

		/*System.out.println("Give me a word:");
		System.out.println(myVar.next());*/
		
		//myVar.close();
		return;
	}


	// Java9 - Conditional Statements
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloConditionalStatements(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int x = 7;
		
		if(x < 42){
			System.out.println("Hi");
		}

		int age = 30;
		System.out.println("How old are you? (Only for older than 16 years old)");
		age = scanner.nextInt();
		System.out.println(age);

		if(age < 16){
			System.out.println("Too Young");			
		} else {
			System.out.println("Welcome!");
		}

		return;
	}

	// Java10 - Nested If Statements
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloNestedIfStatements(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int age = 25;
		System.out.println("How old are you? (Only for older than 16 years old)");
		age = scanner.nextInt();
		System.out.println(age);

		if(age > 0){
			if(age > 16){
				System.out.println("Welcome!");				
			} else {
				System.out.println("Too Young");
			}			
		} else {
			System.out.println("Error");
			
		}

		return;
	}

	// Java11 - Else If Statement
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloElseIfStatement(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int age = 25;
		System.out.println("How old are you? (Only for older than 16 years old)");
		age = scanner.nextInt();
		System.out.println(age);

		if(age <= 0){
			System.out.println("Error");
		} else if(age <= 16){
			System.out.println("Too Young");								
		} else if(age < 100){
			System.out.println("Welcome!");			
		} else {
			System.out.println("Really?");
		}

		return;
	}

	// Java12 - Logical Statements
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloLogicalStatements(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int age = 30, money = 1000;
		
		if(age > 18){
			if(money >500){
				System.out.println("Welcome!");
			}
		}

		if(age > 18 && money > 500){
			System.out.println("Welcome!!");
		}

		age = 25;
		money = 100;
		
		if(age > 18 || money > 500){
			System.out.println("Welcome!!!");
		}
		
		age = 18;
		if(!(age > 18)){
			System.out.println("Too Young");
		} else {
			System.out.println("Welcome!!!!");
		}
		
		return;
	}

	// Java13 - The Switch Statement
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloTheSwitchStatement(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int day = 3;
		
		System.out.println("What day is today?");
		day = scanner.nextInt();
		System.out.println(day);
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Error");
		}
		
		return;
	}

	// Java14 - While Loops
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloWhileLoops(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int x = 3;
		
		System.out.println("The 1st while loop:");
		while(x > 0){
			System.out.println(x);
			x--;
		}
		
		System.out.println("The 2nd while loop:");
		x = 6;
		while(x < 10){
			System.out.println(x);
			x++;
		}

		return;
	}

	// Java15 - For Loops
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloForLoops(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		System.out.println("The 1st for loop:");
		for(int x = 1; x <= 5; x++){
			System.out.println(x);
		}

		System.out.println("The 2nd for loop:");
		int x = 1;
		for(; x <= 5;){
			System.out.println(x);
			x++;
		}

		System.out.println("The 3rd for loop:");
		for(x = 0; x <= 10; x=x+2){
			System.out.println(x);
		}

		return;
	}

	// Java16 - Do While Loops
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloDoWhileLoops(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int x = 1;

		System.out.println("The 1st do while loop:");
		do{
			System.out.println(x);
			x++;
		}while(x<5);

		System.out.println("The 2nd while loop:");
		x = 1;
		{
			System.out.println(x);
			x++;
		}
		while(x<5){
			System.out.println(x);
			x++;
		}

		System.out.println("break:");
		x = 1;
		while(x>0){
			System.out.println(x);
			if(x == 4){
				break;
			}
			x++;
		}

		System.out.println("continue:");
		for(x = 10; x<= 40; x=x+10){
			if(x == 30){
				continue;
			}
			System.out.println(x);
		}
		
		return;
	}

	// Java17 - Arrays
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloArrays(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2 = new int[5];
		
		arr1 = new int[6];
		arr1[5] = 123;
		
		arr2[2] = 42;
		
		System.out.println("arr1[5] = " + arr1[5]);
		System.out.println("arr2[2] = " + arr2[2]);
		
		int[] arr3 = {1, 2, 3, 4, 5, 6};
		String[] myNames= {"A", "B", "C", "D", "E", "F"};

		System.out.println("arr3[5] = " + arr3[5]);
		System.out.println("myNames[2] = " + myNames[2]);
		
		return;
	}

	// Java18 - Summing Elements In Arrays
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloSummingElementsInArrays(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int[] intArr = new int[5];
		
		System.out.println("the length of intArr is " + intArr.length);
		
		int[] myArr = {6, 42, 3, 7};
		int sum = 0;
		for(int x=0; x < myArr.length; x++){
			sum += myArr[x];
		}
		System.out.println("sum of myArr = " + sum);

		return;
	}

	// Java19 - Enhanced For Loop (for each loop)
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloEnhancedForLoop(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int[] primes = {2, 3, 5, 6, 7};
		
		for(int t: primes){
			System.out.println(t + ",");
		}

		return;
	}

	// Java20 - Multidimensional Arrays
	/* (non-Javadoc)
     * @author Leonardo Zhao
     * @version 1.0
     * @param iChapter Chapter Number strChapter Chapter Name
	 */
	public static void soloMultidimensionalArrays(int iChapter, String strChapter) {
		// print chapter
		System.out.println("\r\n#Java#" + iChapter + " " + strChapter + "\r\n");

		// TODO Auto-generated method stub
		int[][] sample = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for(int[] x: sample){
			for(int y: x){
				if(y != x[x.length - 1]){
					System.out.printf("%d, ", y);
				}
				else
				{
					System.out.printf("%d\r\n", y);
				}
				
			}
		}
		
		System.out.println("sample[2][0] =" + sample[2][0]);
		
		System.out.printf("\r\n");
				
		String array[][] = {{"Hey", "John", "Bye"}, {"John", "Johnson", "Hello"}, {"Leo", "Leonardo", "Hi"}};

		//int i = 0;
		for(String[] x: array){
			for(String y: x){
				//i++;
				//if(0 != (i % array[0].length)){
				if(y != x[x.length - 1]){
					System.out.printf("%s, ", y);
				}
				else
				{
					System.out.printf("%s\r\n", y);
				}
				
			}
		}

		System.out.println("array[1][1] = " + array[1][1]);
		
		System.out.printf("\r\n");
		
		int[][] myArr = {{1, 2, 3}, {4}, {5, 6, 7}};
		myArr[0][2] = 42;
		int z = myArr[1][0];
		
		for(int[] x: myArr){
			for(int y: x){
				if(y != x[x.length - 1]){
					System.out.printf("%d, ", y);
				}
				else
				{
					System.out.printf("%d\r\n", y);
				}
				
			}
		}
		
		System.out.println("myArr[0][2] = " + myArr[0][2]);
		System.out.println("myArr[1][0] = " + z);

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
