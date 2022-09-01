package clases;

public class Calculadora {

    private int numero1;
    private int numero2;

    public Calculadora() {
    }

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumar (){

        return this.numero1+this.numero2;

    }

    public int restar (){

        return this.numero1-this.numero2;

    }

    public int multiplicar (){

        return this.numero1*this.numero2;

    }

    public double dividir (){

        return this.numero1/this.numero2;

    }

}
