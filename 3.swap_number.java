//  swap two numbers without using a third variable 

public class Main {

public static void main(String[] args) {
	int a = 10;
	int b = 20;

    System.out.println("a is " + a + " and b is " + b);

	a = a + b;
	b = a - b;
	a = a - b;

    System.out.println("After swapping, a is " + a + " and b is " + b);
    }

}
