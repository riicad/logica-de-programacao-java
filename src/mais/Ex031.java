package mais;

import java.util.Scanner;
//Desenvolva um programa que remova os espaços em branco de uma string.
public class Ex031 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = leia.nextLine();

        leia.close();

        String semEspaco = frase.replace(" ", "");
        System.out.println(semEspaco);
    }
}
