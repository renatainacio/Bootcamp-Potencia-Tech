import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        int i;
        int len = palavra.length();
        for (i = 0; i < len; i++)
        {
           if (palavra.charAt(i) != palavra.charAt(len - i - 1))
               break;
        }
        if (i == len)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }
}