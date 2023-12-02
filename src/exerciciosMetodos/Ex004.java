package exerciciosMetodos;

//Implemente um método chamado fatorial que calcula o fatorial de um número passado como parâmetro.
public class Ex004 {
    static int fatorial(int num){
        int resultado = 1;
        for(int i=num; i>0; i--){
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args){
        System.out.println(fatorial(5));
    }
}
