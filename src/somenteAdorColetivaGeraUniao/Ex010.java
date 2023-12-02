package somenteAdorColetivaGeraUniao;

//Dado um array de números inteiros, imprima cada número até encontrar um número negativo. Use break para interromper o loop nesse ponto.
public class Ex010 {
    public static void main(String[] args){
        int[] lista = {1, 3, 4, 5, -9, 10, 6};

        for(int num : lista){
            if(num<0){
                break;
            }else{
                System.out.println(num);
                continue;
            }
        }
    }
}
