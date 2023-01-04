//sum all the array elements
public class SumArrayElements {
    public static void main(String[] args) {
        int input[] = {2,2,1,10,1};
        int sum =0;
        for (int i=0 ;i<input.length;i++){
            sum= sum+ input[i];
        }
        System.out.println(sum);
     }
}
