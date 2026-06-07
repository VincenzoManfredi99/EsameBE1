package GDR;

public class Mercante extends Personaggio {

    int ricchezza;
    int inventario;

    public Mercante(String nome, double hp, int livello, int ricchezza, int inventario) {
        super(nome, hp, livello);
        this.ricchezza = ricchezza;
        this.inventario = inventario;
    }
}
