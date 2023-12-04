package FACCAT;
import java.util.Scanner;

//
public class Ex020 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = leia.nextInt();

        leia.close();

        if (numero1 > numero2) {
            System.out.println("Em order fica " + numero1+" depois "+numero2);
        } else {
            System.out.println("Em ordem fica" + numero2+"depois"+numero1);
        }
    }
}
