package exerciciosMetodos;

public class Ex007 {
    static double converterCelsiusParaFarenheit(double celsius){
        return celsius*1.8+32;
    }

    public static void main(String[] args){
        double grausCelsius = 100;
        System.out.println(converterCelsiusParaFarenheit(grausCelsius));
    }
}
