package FACCAT;

import java.util.Scanner;

//Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
//final é:
public class Ex013 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        double n1 = leia.nextDouble();

        System.out.println("Digite nota 2: ");
        double n2 = leia.nextDouble();

        System.out.println("Digite nota 3: ");
        double n3 = leia.nextDouble();

        leia.close();

        double media = (n1*2 + n2*3 + n3*5)/10;

        System.out.println("A sua média é: "+media);
    }
}
