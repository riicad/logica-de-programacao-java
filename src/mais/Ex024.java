package mais;

import java.util.Scanner;
//) Escreva um programa que inverta a ordem das palavras em uma frase.
public class Ex024 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = leia.nextLine();

        leia.close();

        String[] listaFrase = frase.split(" ");

        for(int i = listaFrase.length -1; i>=0; i--){
            System.out.println(listaFrase[i]);
        }

    }
}
