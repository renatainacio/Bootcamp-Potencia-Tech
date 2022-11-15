import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Double> notas = new ArrayList<>(Arrays.asList(3.6, 4.5, 8.9));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext())
            soma += iterator.next();
        System.out.println(notas);
        System.out.println(soma);

    }
}