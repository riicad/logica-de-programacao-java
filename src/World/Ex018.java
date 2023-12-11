package World;
import java.util.Scanner;

//18) Crie um programa que leia dois números inteiros e exiba o maior deles.
public class Ex018 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leia.nextInt();

        System.out.println("Digite outro número");
        int numero1 = leia.nextInt();

        leia.close();

        System.out.println(numero>numero1 ? numero : numero1);
    }
}
