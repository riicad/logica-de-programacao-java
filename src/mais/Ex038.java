package mais;

import java.util.Scanner;
//Crie um programa que conte o número de palavras em uma frase.
public class Ex038 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String[] frase = leia.nextLine().split(" ");

        leia.close();

        System.out.println("A quantidade de palavras na sua frase é: "+frase.length);
    }
}
