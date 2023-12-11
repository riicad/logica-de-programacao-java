package World;
import java.util.Scanner;
// Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação. Se o número de faltas for maior que 15, ele é reprovado por falta.
public class Ex025 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número de faltas: ");
        int num = leia.nextInt();

        leia.close();

        System.out.println(num>=15 ? "REPROVADO" : "APROVADO");
    }
}
