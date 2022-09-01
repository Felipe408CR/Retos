package clases;

public class Personaje {

    // ATRIBUTOS

    String nombe;
    int poderPatada;
    int poderGolpe;
    int defensa;
    int superPoder;

    int cantidadVida;


    // CONSTRUCTOR

    public Personaje() {
    }

    public Personaje(String nombe, int poderPatada, int poderGolpe, int defensa, int superPoder, int cantidadVida) {
        this.nombe = nombe;
        this.poderPatada = poderPatada;
        this.poderGolpe = poderGolpe;
        this.defensa = defensa;
        this.superPoder = superPoder;
        this.cantidadVida = cantidadVida;
    }

    // METODOS

    // me estan atacando

    public void atacar(int ataqueEmemigo){

        this.cantidadVida=this.cantidadVida-ataqueEmemigo;

    }

    public  void defender (int ataqueEnemigo){

        this.cantidadVida=this.cantidadVida-(ataqueEnemigo-this.defensa);

    }

    public void aplicarSuperPoder (boolean poder){

        if (poder==true){

            // agregar ataque

            this.poderGolpe=this.poderGolpe+this.superPoder;

        }else {

            // agregar defensa

            this.defensa=this.defensa+this.superPoder;

        }

    }


}
