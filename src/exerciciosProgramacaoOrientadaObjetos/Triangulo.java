package exerciciosProgramacaoOrientadaObjetos;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private int tipoTriangulo;
    private double area;

    public void setLadoA(double num){
        this.ladoA = num;
    }
    public void setLadoB(double num){
        this.ladoB = num;
    }
    public void setLadoC(double num){
        this.ladoC = num;
    }

  public void verificarTriangulo(){
        if (ladoA==ladoB && ladoB==ladoC){
            this.tipoTriangulo = 1;
            System.out.println("Seu triângulo é equilátero.");
        }
        else if(ladoA!=ladoB && ladoB != ladoC){
            this.tipoTriangulo = 2;
            System.out.println("Seu triângulo é escaleno!");
        }
        else{
            this.tipoTriangulo = 3;
            System.out.println("Seu triângulo é isóceles.");
        }
  }

  public double areaTriangulo(){
        if(tipoTriangulo==1){
            this.area = ladoA*(Math.sqrt(3)/4);

        }
        else if(tipoTriangulo==2 || tipoTriangulo==3){
            double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
            this.area = Math.sqrt(semiPerimetro *
                    (semiPerimetro - ladoA) *
                    (semiPerimetro - ladoB) *
                    (semiPerimetro - ladoC));
        }
    return this.area;

  }
}
