import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = n;
        int cnt = 1;
        int tmp = 0;
        //res = n;
        n--;
        while (n > 0) {
            if (cnt % 4 == 1)
                res = res * n;
            else if (cnt % 4 == 2)
                res = res / n;
            else if (cnt % 4 == 3) {
                res = tmp + res + n;
                tmp = 0;
            }
            else if (cnt % 4 == 0)
            {
                if (n == 1)
                    res--;
                else if (n == 2)
                    res = res - 2;
                else {
                tmp = res;
                res = -n;}
            }
            cnt++;
            n--;
        }
        System.out.println(res);
    }
}