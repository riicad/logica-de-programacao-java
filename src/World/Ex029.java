package World;
import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Nota do aluno: ");
        double nota = scanner.nextDouble();

        // Processamento e saída de dados
        if (nota >= 7) {
            System.out.println("O " + nome + " está APROVADO");
        } else {
            System.out.println("O " + nome + " está REPROVADO!");
        }

        // Fechar o scanner
        scanner.close();
    }
}
