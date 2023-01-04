//reverse the array elements without extra space
public class ReverseArrayElements {
    public static void main(String[] args) {
        int input[] = {1,2,3,4,5};
        System.out.println("original array");
        extracted(input);
        int start_index =0;
        int end_index =input.length-1;
        while (start_index<end_index){
            int start_value,end_value;
            start_value = input[start_index];
            end_value = input[end_index];

            input[start_index]= end_value;
            input[end_index]=start_value;

            start_index++;
            end_index--;
        }

        System.out.println("reversed array ");
        extracted(input);
    
    }

    private static void extracted(int[] input) {
        for (int num : input
             ) {
            System.out.println(num);
        }
    }

}
