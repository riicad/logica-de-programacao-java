package FACCAT;

//Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
//e mostre seu peso ideal, utilizando as seguintes fórmulas:
//- para sexo masculino: peso ideal = (72.7 * altura) - 58
//- para sexo feminino: peso ideal = (62.1 * altura) - 44.7
public class Ex023 {
    public static void main(String[] args){
        String nome = "Rian";
        String sexo = "M";
        double altura = 1.72;

        double peso_ideal;
        if(sexo.toLowerCase()=="m") {
            peso_ideal = (72.7 * altura) - 58;
        }
        else {
            peso_ideal = (62.1 * altura) - 44.7;
        }

        System.out.println("Seu peso ideal é: "+peso_ideal);

    }
}
