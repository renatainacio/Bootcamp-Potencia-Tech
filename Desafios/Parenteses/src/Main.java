import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        boolean ehValido = true;
        int i;
        int j;
        char[] caracteres = {'(', ')', '[', ']', '{', '}'};
        int[] parenteses = {0, 0, 0, 0, 0, 0};
        for (i = 0; i < s.length(); i++)
        {
            for (j = 0; j < 6; j++)
            {
                if (s.charAt(i) == caracteres[j])
                    parenteses[j]++;
            }
        }
        if ((parenteses[0] != parenteses[1]) || (parenteses[2] != parenteses[3])
                || (parenteses[4] != parenteses[5]))
            return (false);
        else
            return true;
    }
}