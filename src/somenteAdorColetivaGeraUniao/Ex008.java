package somenteAdorColetivaGeraUniao;

//Imprima os números de 1 a 10, pulando a impressão do número 5 e interrompendo o loop quando encontrar o número 8.
public class Ex008 {
    public static void main(String[] args){
        for(int i=1; i<11; i++){
            if(i!=5){
                System.out.println(i);
                continue;
            }else if(i==8){
                break;
            }
        }
    }
}
