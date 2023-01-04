//find the max number in given array
public class FindMaxInArray {
    public static void main(String[] args) {
        int input[] = {3,5,22,5,7};

        int max= input[0];

        for (int i =1; i<input.length;i++)
        {
            if (max<input[i]){
                max= input[i];
            }
        }

        System.out.println(max);
    }



}
