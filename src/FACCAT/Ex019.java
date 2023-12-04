package FACCAT;
import java.util.Scanner;

//Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
public class Ex019 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = leia.nextInt();

        leia.close();

        if(numero1>numero2){
            System.out.println("o maior é "+numero1);
        }
        else{
            System.out.println("O maior é "+numero2);
        }
    }
}
