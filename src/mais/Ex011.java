package mais;
import java.util.Scanner;

//converta temperatura de graus celsius para farenheit
public class Ex011 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        double Celsius = leia.nextFloat();

        leia.close();

        double Farenheit = Celsius * 1.8 + 32.0;
        System.out.printf("%.2f C° = %.2f F°", Celsius, Farenheit);
    }
}
