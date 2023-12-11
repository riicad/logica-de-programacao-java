package World;
import java.util.Scanner;

//2) Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.

public class Ex002 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = leia.nextDouble();

        leia.close();

        System.out.println("A area do seu círculo é: "+((raio*raio)*Math.PI));
        System.out.println("O peímetro do seu círculo é: "+(2*Math.PI*raio));

    }
}
