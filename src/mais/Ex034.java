package mais;

import java.util.Scanner;
//Desenvolva um programa que converta um número decimal para binário
public class Ex034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        int numeroDecimal = scanner.nextInt();

        String binario = converterParaBinario(numeroDecimal);

        System.out.println("O número binário corresponde a: " + binario);

        scanner.close();
    }

    static String converterParaBinario(int numeroDecimal) {
        if (numeroDecimal == 0){
            return "0";
        }

        StringBuilder resultado = new StringBuilder();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % 2;
            resultado.insert(0, resto);
            numeroDecimal /= 2;
        }

        return resultado.toString();
    }
}
