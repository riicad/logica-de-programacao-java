package World;
import java.util.Scanner;

// Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.
public class Ex021 {
    public static void main(String[] args) {
        int menores = 0;
        int maiores = 0;
        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a idade: ");
            int numero = leia.nextInt();

            if (numero >= 18) {
                maiores++;
            } else {
                menores++;
            }

            System.out.println("Você deseja adicionar mais uma pessoa?(0 para continuar) (999 para PARAR)");
            int R = leia.nextInt();

            if (R==999) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Maiores de idade: "+maiores);
        System.out.println("Menores de idade: "+menores);
    }
}
