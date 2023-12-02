package exerciciosMetodos;
import java.util.Arrays;

public class Ex010 {
    static int[] ordenadorCrescente(int[] listaInt){
        Arrays.sort(listaInt);
        return listaInt;
    }

    public static void main(String[] args){
        int[] numeros = {1, 4, 5, 3, 9, 10, 23, 8};
        ordenadorCrescente(numeros);

        for (int i: numeros){
            System.out.println(i);
        }
    }
}
