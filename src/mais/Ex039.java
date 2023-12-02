package mais;
import java.util.Scanner;

// Escreva um programa que determine se um ano é bissexto.
public class Ex039 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = leia.nextInt();

        leia.close();

        if(ano%400==0 && ano%100==0){
            System.out.println("Seu ano é bisexto!");
        }else {
            System.out.println("Seu ano não é bisexto");
        }
    }
}
