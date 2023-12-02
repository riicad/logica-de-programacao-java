package somenteAdorColetivaGeraUniao;
//Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo. Use break para interromper o loop interno quando o número 3 for atingido.

public class Ex003 {
    public static void main(String[] args){
        for(int i=0; i<=5; i++){
            System.out.println("Loop externo: "+i);
            System.out.println("--------------------------------------");

            for(int j=0; j<=5; j++){
                System.out.println("Loop interno: "+j);
                if(j==3){
                    break;
                }
            }
        }
    }
}
