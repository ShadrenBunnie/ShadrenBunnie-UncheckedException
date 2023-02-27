import java.util.Scanner;

public class Lab {
    /**
     * This method must throw an unchecked exception.
     * unchecked means that you do not need to wrap the method in a try/catch or a throws declaration.
     * Unchecked exceptions may include situations like arithmetic errors like dividing by zero,
     * accessing an index of an array which is out of bounds, stack overflow (result of infinite recursion), etc.
     *
     * For this challenge, I recommend creatively causing such an exception rather than using the 'throws' keyword,
     * which would also work since RuntimeExceptions are still technically Exceptions.
     *
     * You could view the entire Exception family here: https://programming.guide/java/list-of-java-exceptions.html
     * Notice that errors are separate from exceptions. Errors are external to Java and can occur when some external
     * event happens, like running out of computer memory.
     */


    public void throwUncheckedException(){

        int a = 12;
        int b = 6;
        int c = 3;
        int d = 2;
        int e = 1;
        int f = 0;

        System.out.println("a = "+ a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        System.out.println("e = " +e);
        System.out.println("f = " +f);

        int sum1 = a / b;
			System.out.println("The sum of a / b = " +sum1);
        int sum2 = a / c;
			System.out.println("The sum of a / c = " +sum2);
        int sum3 = a / d;
			System.out.println("The sum of a / d = " +sum3);
        int sum4 = a / e;
			System.out.println("The sum of a / e = " +sum4);
        int sum5 = a / f;
			System.out.println("The sum of a / f = " +sum5);




        }

    
    
}
