public class FactorialRecursion {
    public static void main(String[] args) {
        int number = 10; // You can change this number to test with different values
        long factorial = factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
