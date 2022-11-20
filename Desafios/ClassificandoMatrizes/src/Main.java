import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int [] nums = new int[N];
        for (i = 0; i < N; i++)
        {
            nums[i] = input.nextInt();
        }
        int countPar = 0;
        for(i = 0; i < N; i++)
        {
            if(nums[i] % 2 == 0)
                countPar++;
        }
        int j = 0;
        int aux = 0;
        int newArray[] = new int[N];
        for(i = 0; i < countPar; i++)
        {
            for (j = aux; j < N; j++)
            {
                if(nums[j] % 2 == 0) {
                    newArray[i] = nums[j];
                    aux = j + 1;
                    break;
                }
            }
        }
        aux = 0;
        for(i = countPar; i < N; i++)
        {
            for (j = aux; j < N; j++)
            {
                if(nums[j] % 2 != 0) {
                    newArray[i] = nums[j];
                    aux = j + 1;
                    break;
                }
            }
        }
        for (var entry : newArray)
            System.out.println(entry);





    }
}