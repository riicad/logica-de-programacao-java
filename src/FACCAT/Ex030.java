package FACCAT;

import java.util.Scanner;

//Exercícios de Lógica de Programação - Algoritmos
//Profa. Flávia Pereira de Carvalho - fpereira@faccat.br - http://fit.faccat.br/~fpereira 7
//30) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
//crescente
public class Ex030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler 3 valores
        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = scanner.nextInt();

        // Ordenar os valores em ordem crescente
        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if (valor2 > valor3) {
            int temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }

        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3);
    }
}

