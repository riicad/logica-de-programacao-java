package exerciciosProgramacaoOrientadaObjetos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double [] notas;

    public void setNomeAndNumeroNotas(String nomeAluno, int numNotas){
        this.nome = nomeAluno;
        this.notas = new double[numNotas];
    }

    public void setMatricula(String codigoMatricula){
        this.matricula = codigoMatricula;
    }

    public void setNotas(){
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i <this.notas.length; i++) {
            System.out.println("Digite a nota "+(i+1)+": ");
           this.notas[i] = leia.nextDouble();
        }
    }

    public void setMedia(){
        int somaTudo = 0;
        for(double n : this.notas){
            somaTudo+= n;
        }
        System.out.println("Sue média é "+somaTudo/this.notas.length);
    }
}