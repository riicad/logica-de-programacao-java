package exerciciosMetodos;

import java.util.Locale;

public class Ex005 {
    static int contaCaracter(String palavra){
        int contador = 0;
        palavra.toLowerCase();
        palavra.replace(" ", "");
        for(int i =0; i<palavra.length(); i++){
            if(palavra.charAt(i)=='a' || palavra.charAt(i)=='e' || palavra.charAt(i)=='i'
            || palavra.charAt(i)=='u' || palavra.charAt(i)=='o'){
                contador +=1;
            }
        }
        return contador;
    }
    public static void main(String[] args){
        String palavra = "ola mundo";
        System.out.println(contaCaracter(palavra));
    }
}
