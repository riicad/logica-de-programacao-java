package mais;
import java.util.Scanner;

//Implemente um programa que calcule o volume de uma esfera.
public class Ex030 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o raio da esfera: ");
        double raio = leia.nextDouble();

        leia.close();

        double volume = ((4/3)* Math.PI * (raio*raio*raio))/3;
        System.out.println("O tamanho do seu raio é: "+volume);

    }
}
