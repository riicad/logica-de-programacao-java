package FACCAT;
import java.util.Scanner;

//Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
//ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
//dos outros 2 lados.
public class Ex031 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("LADO A: ");
        double A = leia.nextDouble();

        System.out.println("LADO B: ");
        double B = leia.nextDouble();

        System.out.println("LADO C: ");
        double C = leia.nextDouble();

        leia.close();

        if (A>B+C || B>A+C || C>A+B){
            System.out.println("É UM TRIÂNGULO");
        }
        else{
            System.out.println("NÃO É UM TRIÂNGULO");
        }
    }
}
