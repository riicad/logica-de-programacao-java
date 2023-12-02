package mais;
import java.util.Scanner;

//calcule a area de um circulo
public class Ex019 {
   public static void main(String[] args){
       Scanner leia = new Scanner(System.in);
       System.out.println("Digite o raio de um círculo: ");
       int raio = leia.nextInt();

       double area =  Math.PI * Math.pow(raio, 2);

       System.out.printf("O raio do círculo é: %2.f", area);
   }
}
