package World;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        leia.close();

        System.out.println(numero%2==0 ?"PAR" : "ÍMPAR");
    }
}
