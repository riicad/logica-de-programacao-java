package somenteAdorColetivaGeraUniao;

//Imprima os números de 1 a 10, mas pare a execução do loop quando chegar a 5.
public class Ex001 {
    public static void main(String[] args){
        int i = 0;
        while(i != 11){
            if (i==5){
                break;
            } else{
                i++;
                System.out.println(i);
                continue;
            }

        }
    }
}
