public class FactorialTest {
    public static void main(String[] args) {
        int result = Factorial.factorial(5);
        System.out.println("Expected result: 120\nActual result: " + result);

        result = Recursion.myPow(2, 5);
        // Expected 32
        System.out.println("Expected Result: 32\nActual Result: " + result);

        String reverse = Recursion.reverse("Hello!");
        System.out.println("Expected result: !olleH\nActual result: " + reverse);

    }
}
