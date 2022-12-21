//given n number print nth fibonacci number
public class P320 {
    public static void main(String[] args) {

        int givenNumber = 9;
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 2; i <= givenNumber; i++) {
            result = first + second;
            first = second;
            second = result;

        }
        System.out.println(result);

    }
}
