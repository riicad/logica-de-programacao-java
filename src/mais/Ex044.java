package mais;

public class Ex044 {
        public static void main(String[] args) {
            String texto = "123";

            int num = Integer.parseInt(texto);

            try{
                System.out.println(num+" SIM, ELE É UM NÚMERO");
            }catch(NumberFormatException e){
                System.out.println("Sua string não é um número.");
            }
        }
    }

