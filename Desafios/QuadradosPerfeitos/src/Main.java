import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int i;
        for (i = 0; i * i <= n; i++);
        int len = i - 1;
        int quadrados[] = new int[len];
        for (i = 1; i<len + 1; i++)
            quadrados[i - 1] = i * i;
        int count;
        int countFinal = 2_147_483_647;
        int j;
        int aux;
        for (i = len - 1; i >= 0; i--)
        {
            aux = n;
            count = 0;
            for (j = i; j >= 0; j--)
            {
                while (aux > 0) {
                    if (aux >= quadrados[j]) {
                        aux = aux - quadrados[j];
                        count++;
                    }
                    else
                        j--;
                }
            }
            if (count < countFinal)
                countFinal = count;
        }
        System.out.println(countFinal);
    }
}