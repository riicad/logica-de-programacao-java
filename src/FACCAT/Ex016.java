package FACCAT;
import java.util.Scanner;

//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra
public class Ex016 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas maças foram compradas? ");
        int maca = leia.nextInt();

        leia.close();

        if(maca>11){
            System.out.println("Custo Total: R$"+maca*1.00);
        }
        else{
            System.out.println("Custo Total: R$"+maca*1.30);
        }
    }
}
