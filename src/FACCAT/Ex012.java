package FACCAT;
import java.util.Scanner;

//Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
//correspondente em graus Celsius (baseado na fórmula abaixo
public class Ex012 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura em F°: ");
        double fahrenheit = leia.nextDouble();

        leia.close();

        System.out.println("O valor em graus celsius é: "+(fahrenheit-32)*(5/9)+" C°");

    }
}
