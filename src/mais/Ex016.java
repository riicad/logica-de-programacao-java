package mais;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja ver na sequencia de fibonacci: ");
        int quantidade = leia.nextInt();

        leia.close();

        int primeiro = 0;
        int segundo = 1;

        for (int i = 0; i < quantidade; i++) {
            System.out.println(primeiro);

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
