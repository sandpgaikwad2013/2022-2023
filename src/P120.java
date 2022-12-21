//given number nth print nth fibonacci number using recurrence
public class P120 {
    public static void main(String[] args) {
        System.out.println("welcome");
       int output = fibonacciNumber(5);
       System.out.println(output);
    }

    public static int fibonacciNumber(int givenNumber) {
        if (givenNumber <= 1) {
            return givenNumber;
        }
        return fibonacciNumber(givenNumber - 1) + fibonacciNumber(givenNumber - 2);

    }

}
