//reverse the given number
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 121;
     int  reverseNumber =  extracted(number);
     if (number==reverseNumber){
         System.out.println("Palindrome number "+number);
     }else {
         System.out.println("not a palindrome number "+number);
     }

    }

    private static int extracted(int number) {
        int revere = 0, current_num = number;
        while (current_num > 0) {
            revere = revere * 10 + current_num % 10;
            current_num = current_num / 10;
        }
        System.out.println(revere);
        return  revere;
    }
}
