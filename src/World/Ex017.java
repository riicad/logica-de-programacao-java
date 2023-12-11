package World;
import java.util.Scanner;

// Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.
public class Ex017 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();

        leia.close();

        System.out.println(idade>50 ? "IDOSO" :
                idade<50 && idade>18 ? "ADULTO" :
                idade<18 && idade>12 ? "ADOSLESCENTE" : "CRIANÇA");
    }
}
