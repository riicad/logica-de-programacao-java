package FACCAT;

import java.util.Scanner;

//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores.
public class Ex029 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int maior = 0;
        int segundoMaior = 0;
        for(int i=0; i<3; i++){
            System.out.printf("NUMERO %d: ", i);
            int numero = leia.nextInt();

            if(numero>maior){
                segundoMaior = maior;
                maior = numero;
            }
        }

        leia.close();
        System.out.println("A soma entre os maiores deles é: "+(maior+segundoMaior));


    }
}
