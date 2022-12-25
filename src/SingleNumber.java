// print number in array which is appears Exactly once x = [2,2,3,3,1] , answer = 1
public class SingleNumber {
    public static void main(String[] args) {
        int[] input = new int[5];
        input[0] = 2;
        input[1] = 2;
        input[2] = 1;
        input[3] = 3;
        input[4] = 3;
        int out =0;
        for (int n1 :input) {
            out = out ^ n1;
        }
        System.out.println(out);
    }
}
