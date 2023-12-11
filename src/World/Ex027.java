package World;
import java.util.Scanner;

//Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e exiba uma mensagem indicando se ela pode ou não se
public class Ex027 {
    public static void main(String[] args){
        // Entrada de dados
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = leia.next().charAt(0);

        // Processamento
        if (Character.toUpperCase(sexo) == 'M') {
            if (idade > 65) {
                // Saída de dados
                System.out.println("Ele pode se aposentar!");
            } else {
                // Saída de dados
                System.out.println("Não pode se aposentar!");
            }
        } else {
            if (idade > 60) {
                // Saída de dados
                System.out.println("Ela pode se aposentar!");
            } else {
                // Saída de dados
                System.out.println("Ela não pode se aposentar!");
            }
        }

        // Fechando o scanner para evitar vazamentos de recursos
        leia.close();
    }

}
