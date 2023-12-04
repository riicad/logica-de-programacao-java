package FACCAT;


public class Ex034 {
    public static void main(String[] args){
        int x = 3;
        int y = 2;
        int z = (x*y)+5;

        String resposta;
        if (z<=0){
            resposta = "A";
        }
        else if (z<=100){
            resposta = "B";
        }
        else{
            resposta = "C";
        }

        System.out.println(resposta);

    }
}
