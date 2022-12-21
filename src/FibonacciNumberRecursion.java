//given number nth print nth fibonacci number using recurrence
public class FibonacciNumberRecursion {
    public static void main(String[] args) {
        System.out.println("welcome");
       int output = fibonacciNumber(9);
       System.out.println(output);
    }

    public static int fibonacciNumber(int givenNumber) {
        if (givenNumber <= 1) {
            return givenNumber;
        }
        return fibonacciNumber(givenNumber - 1) + fibonacciNumber(givenNumber - 2);

    }

}
