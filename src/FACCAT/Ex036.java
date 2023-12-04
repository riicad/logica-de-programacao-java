package FACCAT;
import java.util.Scanner;

//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
//das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
//novo com a mulher mais velha
public class Ex036 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomemUm = leia.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomemDois = leia.nextInt();


        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = leia.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulher2 = leia.nextInt();

        int somaIdades = (idadeHomemUm > idadeHomemDois ? idadeHomemUm : idadeHomemDois) +
                (idadeMulher1 < idadeMulher2 ? idadeMulher1 : idadeMulher2);

        int produtoIdades = (idadeHomemUm < idadeHomemDois ? idadeHomemUm : idadeHomemDois) *
                (idadeMulher1 > idadeMulher2 ? idadeMulher1 : idadeMulher2);

        System.out.println("Soma das idades do homem mais velho e a mulher mais nova é de: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo e a mulher mais velha é de: " + produtoIdades);
    }
}
