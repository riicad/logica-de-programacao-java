package FACCAT;
import java.util.Scanner;

//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
public class Ex028 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("NUMERO 1: ");
        int numero = leia.nextInt();

        System.out.println("NUMERO 2: ");
        int numero2 = leia.nextInt();

        System.out.println("NUMERO 3: ");
        int numero3 = leia.nextInt();

        leia.close();

        System.out.println("O maior entre eles é: ");

        if(numero>numero2 && numero>numero3){
            System.out.println(numero);
        }
        else if(numero2>numero&& numero2>numero3){
            System.out.println(numero2);
        }else{
            System.out.println(numero3);
        }
    }
}
