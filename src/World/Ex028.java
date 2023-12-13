package World;
import java.util.Scanner;
public class Ex028 {

        public static void main(String[] args) {
            // Entrada de dados
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu peso (Kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Digite sua altura (m): ");
            double altura = scanner.nextDouble();

            // Processamento
            double imc = peso / (altura * altura);
            String resposta;

            if (imc < 18.5) {
                resposta = "BAIXO PESO";
            } else if (imc >= 18.5 && imc < 24.9) {
                resposta = "PESO NORMAL";
            } else if (imc >= 24.9 && imc < 29.9) {
                resposta = "SOBRE PESO";
            } else if (imc >= 30 && imc < 34.9) {
                resposta = "OBESIDADE GRAU 1";
            } else if (imc >= 35 && imc < 39.9) {
                resposta = "OBESIDADE GRAU 2";
            } else {
                resposta = "OBESIDADE GRAU 3";
            }

            // Saída de dados
            System.out.println("Seu IMC é " + imc + " e sua classificação é: " + resposta);

            // Fechar o scanner
            scanner.close();
        }


}
