package exerciciosProgramacaoOrientadaObjetos;

public class Ponto {
  private int x;
  private int y;

  public void coordX(int valorX){
      this.x = valorX;
  }

  public void coordY(int valorY){
      this.y = valorY;
  }

  public void mostrarCoordenadas(){
      System.out.println("x: "+x+" y: "+y);
  }

}
