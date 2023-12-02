package mais;

import java.util.Scanner;
//Crie um programa que conte o número de caracteres em uma string.
public class Ex029 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = leia.nextLine();

        leia.close();

        System.out.println("O número de caracteres na sua string é: "+palavra.length());
    }
}
