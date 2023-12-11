package World;
import java.util.Scanner;

//screva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.
public class Ex008 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = leia.nextInt();

        leia.close();
        System.out.println("Valores antes da troca: Valor 1: "+numero+" Valor: 2"+numero2);

        int temporario = numero;
        numero = numero2;
        numero2 = temporario;

        System.out.println("Valores antes da troca: Valor 1: "+numero+" Valor: 2"+numero2);
    }
}


