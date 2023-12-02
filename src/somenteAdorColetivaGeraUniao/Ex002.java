package somenteAdorColetivaGeraUniao;

//Imprima os números ímpares de 1 a 10, usando continue para pular os números pares.
public class Ex002 {
    public static void main(String[] args){
        for (int i=1; i<11; i++){
            if (i%2==1){
                System.out.println(i);
                continue;
            }
        }
    }
}
