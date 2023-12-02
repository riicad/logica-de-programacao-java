package mais;
import java.util.Scanner;

//mostra se o número é primo
public class Ex003 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        leia.close();

        int divisor = 0;
        for(int i = numero; i>0; i-- ) {
            if (numero % i == 0) {
                divisor += 1;
            }
        }

        switch(divisor){
            case 2:
                System.out.printf("O numero %d é PRIMO", numero);
                break;

            default:
                System.out.printf("O número %d NÃO é PRIMO", numero);
                break;
        }
    }
}
