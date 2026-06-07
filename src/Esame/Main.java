package Esame;

public class Main {
    public static void main(String[] args) {

        RegistrazioneAudio mioAudio = new RegistrazioneAudio("Rock", 2, 3);
        mioAudio.play();

        Video mioVideo = new Video("Backrooms", 8, 3, 5);
        mioVideo.play();

        Immagine miaImmagine = new Immagine("Cartolina", 6);
        miaImmagine.show();
    }

}
