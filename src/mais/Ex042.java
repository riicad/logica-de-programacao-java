package mais;
import java.util.Scanner;
// // Crie um programa que valide se um número é um quadrado perfeito.
public class Ex042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (quadradoPerfeito(numero)) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }
    }

    static boolean quadradoPerfeito(int numero){
        if (numero < 0){
            return false;
        }

        int raizQuadrada = (int) Math.sqrt(numero);
        return raizQuadrada * raizQuadrada == numero;
    }

}
