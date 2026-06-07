package Esame;

public class Video extends ElementoMultimediale implements Riproducibile {

    int luminosita;
    int volume;
    int durata;

    public Video(String nomeFile, int volume, int durata, int luminosita) {
        super(nomeFile);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void abbassaVolume() {
        volume = volume - 1;
        System.out.println("Il volume ora è: " + volume);
    }

    public void alzaVolume() {
        volume = volume + 1;
        System.out.println("Il volume ora è: " + volume);
    }

    public void abbassaLuminosita() {
        luminosita = luminosita - 1;
        System.out.println("La luminosita ora è: " + luminosita);
    }

    public void alzaLuminosita() {
        luminosita = luminosita + 1;
        System.out.println("La luminosita ora è: " + luminosita);
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(nomeFile);
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int z = 0; z < luminosita; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
