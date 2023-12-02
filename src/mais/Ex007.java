package mais;
import java.util.Scanner;

//mostra o fatorial de um número
public class Ex007 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Você quer saber o fatorial de qual número? ");
        int numero = leia.nextInt();

        leia.close();

        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            fatorial = fatorial * i;
        }

        System.out.printf("%d! : %d", numero, fatorial);
    }
}
