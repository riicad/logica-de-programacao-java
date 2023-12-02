package mais;

import java.util.Scanner;

//Desenvolva um programa que calcule a hipotenusa de um triângulo retângulo.
public class Ex041 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do primeiro cateto: ");
        double cateto = leia.nextDouble();

        System.out.println("Digite o tamanho do Segundo cateto: ");
        double catetoDois = leia.nextDouble();

        leia.close();

        double hipotenusa = Math.sqrt((cateto*cateto)+(catetoDois*catetoDois));
        System.out.printf("O valor da hipotenusa é: %.2f", hipotenusa);
    }
}
