package somenteAdorColetivaGeraUniao;

//Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo, pulando a impressão do número 3 em cada iteração interna usando continue.
public class Ex004 {
    public static void main(String[] args){
        for(int i=0; i<=5; i++){
            System.out.println("Loop externo: "+i);
            System.out.println("--------------------------------------");

            for(int j=0; j<=5; j++){
                if(j!=3){
                    System.out.println("Loop interno: "+j);
                    continue;
                }
            }
        }
    }
}
