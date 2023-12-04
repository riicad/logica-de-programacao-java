package FACCAT;
import java.util.Scanner;

//ler a area de um retangulo
public class Ex006 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual a altura do seu retangulo? ");
        double altura = leia.nextDouble();

        System.out.println("Qual a base do seu retangulo? ");
        double base = leia.nextDouble();

        leia.close();

        double area = base*altura;
        System.out.println("A area do seu retangulo é: "+area);
    }
}
