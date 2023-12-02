package exerciciosMetodos;
import java.util.Scanner;

//Implemente um método chamado ehPrimo que recebe um número como parâmetro e retorna true se ele for primo e false caso contrário.
public class Ex002 {

    static boolean ehPrimo(int num){
        int divisor = 0;
        for (int i= num; i>0; i--){
            if(num%i==0){
                divisor += 1;
            }
        }
        if (divisor==2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é primo: ");
        int numero = leia.nextInt();

        leia.close();

        if(ehPrimo(numero)==true){
            System.out.println("SEU NÚMERO É PRIMO");
        }else{
            System.out.println("SEU NÚMERO NÃO É PRIMO");
        }
    }
}
