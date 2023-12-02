package mais;
import java.util.Arrays;

// implemente um algoritimo para ordenar um array
public class Ex006 {
    public static void main(String[] args){
        int[] lista = {32, 45, 26, 1, 3, 4, 9, 8, 39, 25};

        Arrays.sort(lista);
        System.out.println("Lista ordenada: ");

        for (int num : lista){
            System.out.println(num);
        }
    }
}
