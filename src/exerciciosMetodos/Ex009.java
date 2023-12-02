package exerciciosMetodos;

public class Ex009 {
    static boolean ehPalindromo(String palavra){
        String inverterPalavra = new StringBuilder(palavra).reverse().toString();

        if(palavra==inverterPalavra.intern()){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        String palindromo = "abasedotetodesaba";
        String naoPalindromo = "Rian";

        System.out.println(ehPalindromo(palindromo));
        System.out.println(ehPalindromo(naoPalindromo));
    }
}
