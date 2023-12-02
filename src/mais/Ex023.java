package mais;

//Crie um programa que calcule o quadrado de cada elemento em um array
public class Ex023 {
    public static void main(String[] args){
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i : lista){
            System.out.printf("\nO quadrado de %d é %d", i, i*i);
        }
    }
}
