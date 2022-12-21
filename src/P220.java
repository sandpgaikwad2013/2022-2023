//given a nth number print nth fibonacci number using dynamic programing
public class P220 {
    public static void main(String[] args) {
        int givenNumber = 9;
        int f[] = new int[givenNumber+2];
        f[0] = 0;
        f[1] =1;
        for(int i=2;i<=givenNumber;i++){
            f[i]= f[i-1]+f[i-2];

        }
        System.out.println(f[9]);
    }


}
