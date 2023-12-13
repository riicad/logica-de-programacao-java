package World;
import java.util.Scanner;
public class Ex030 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas maçãs você comprou? ");
        int quantMacas = scanner.nextInt();
        double totalPagar;

        // Processamento
        if (quantMacas >= 12) {
            totalPagar = quantMacas * 0.40;
        } else {
            totalPagar = quantMacas * 0.50;
        }

        // Saída de dados
        System.out.printf("A saída de dados é: R$%.2f%n", totalPagar);

        // Fechar o scanner
        scanner.close();
    }
}
