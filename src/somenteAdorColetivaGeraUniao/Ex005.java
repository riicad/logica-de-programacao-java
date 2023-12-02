package somenteAdorColetivaGeraUniao;

//imprima os números de 1 a 10, mas pare o loop quando encontrar um número maior que 7.
public class Ex005 {
    public static void main(String[] args){
        for(int i = 1; i<11; i++){
            System.out.println(i);

            if(i>6){
                break;
            }
        }
    }
}
