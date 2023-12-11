package World;
import java.util.Scanner;

//Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.
public class Ex013 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leia.nextInt();

        leia.close();

        System.out.println(numero%numero2==0 ? "O primeiro é multiplo do segundo" : "NÃO é multiplo");
    }
}
