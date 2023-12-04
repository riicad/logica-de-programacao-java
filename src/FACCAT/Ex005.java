package FACCAT;
import java.util.Scanner;

//ler o antecessor
public class Ex005 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu número para ver o antecessor: ");
        int numero = leia.nextInt();

        leia.close();

        System.out.printf("O antecessor de %d é %d", numero, numero-1);
    }
}
