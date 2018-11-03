import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "dang kim long";

        char c = ' ';

        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                count++;
            }
        }

        System.out.println(count);
    }
}
