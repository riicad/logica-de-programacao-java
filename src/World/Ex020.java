package World;
import java.util.Scanner;
// Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
public class Ex020 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite u número: ");
        int numero = leia.nextInt();

        leia.close();

        System.out.println(numero%2==0 ? "PAR" : "IMPAR");
    }

}
