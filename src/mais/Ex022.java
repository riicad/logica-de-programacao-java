package mais;
import java.util.Scanner;

//Desenvolva um programa que encontre os números primos em um intervalo específico.
public class Ex022 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Deseja ver os números primos de 0 á ?");
        int numero = leia.nextInt();

        leia.close();

        System.out.printf("Os números primos entre 0 e %d são: ", numero);

        for(int i = 0; i<numero; i++) {
            int divisor = 0;

            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    divisor += 1;
                }
            }
            if (divisor==2){
                System.out.println(i);
            }

        }
    }
}

