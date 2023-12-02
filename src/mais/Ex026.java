package mais;

import java.util.Scanner;
//Desenvolva um programa que calcule o cosseno de um ângulo
public class Ex026 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o tamanho do ângulo em graus: ");
        double angulo =  leia.nextDouble();

        leia.close();

        double cosseno = Math.cos(angulo);

        System.out.println(cosseno);
    }
}
