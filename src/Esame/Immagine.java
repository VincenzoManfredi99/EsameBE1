package Esame;

public class Immagine extends ElementoMultimediale {
    int luminosita;

    public Immagine(String nomeFile, int luminosita) {
        super(nomeFile);
        this.luminosita = luminosita;
    }

    public void abbassaLuminosita() {
        luminosita = luminosita - 1;
        System.out.println("La luminosita ora è: " + luminosita);
    }

    public void alzaLuminosita() {
        luminosita = luminosita + 1;
        System.out.println("La luminosita ora è: " + luminosita);
    }

    public void show() {
        System.out.print(nomeFile + " ");

        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
    }
}
