package Esame;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    int durata;
    int volume;

    RegistrazioneAudio(String nomeFile, int durata, int volume) {
        super(nomeFile);
        this.durata = durata;
        this.volume = volume;

    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.print(nomeFile + " ");
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println(""); // in modo che vadano a capo e abbiano un ordine
        }
    }

    public void abbassaVolume() {
        volume = volume - 1;
        System.out.println("Il volume ora è: " + volume);
    }

    public void alzaVolume() {
        volume = volume + 1;
        System.out.println("Il volume ora è: " + volume);
    }
}
