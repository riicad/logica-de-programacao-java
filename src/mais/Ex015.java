package mais;

import java.util.Scanner;
//faça um programa para ver raiz quadrada de um número
public class Ex015 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = leia.nextDouble();

        leia.close();

        double resultado = Math.sqrt(numero);

        System.out.println("A raiz quadrada desse numero é: "+resultado);
    }
}
