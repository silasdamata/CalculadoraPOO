package Model;

public class Subtracao implements Operacao{
    private final double numero1;
    private final double numero2;

    public Subtracao (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @Override
    public double calcular() {
        return numero1 - numero2;
    }

    @Override
    public String toString (){
        return "\n" + numero1 + " - " + numero2 +" = " + calcular();
    }
}
