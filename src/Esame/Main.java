package Esame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*RegistrazioneAudio mioAudio = new RegistrazioneAudio("Rock", 2, 3);
        mioAudio.play();

        Video mioVideo = new Video("Backrooms", 8, 3, 5);
        mioVideo.play();

        Immagine miaImmagine = new Immagine("Cartolina", 6);
        miaImmagine.show();*/

        Scanner tastiera = new Scanner(System.in);

        ElementoMultimediale[] lettore = new ElementoMultimediale[5];

        for (int i = 0; i < lettore.length; i++) {

            System.out.println("Scagli il tipo di file (1-Audio, 2-Video, 3-Immagine): ");
            int scelta = tastiera.nextInt();
            tastiera.nextLine();

            System.out.println("Inserisci nome file: ");

            String nome = tastiera.nextLine();

            switch (scelta) {

                case 1: //AUDIO nome, volume, durata
                    System.out.println("Volume iniziale: ");
                    int volumeAudio = tastiera.nextInt();
                    System.out.println("Durata: ");
                    int durataAudio = tastiera.nextInt();
                    lettore[i] = new RegistrazioneAudio(nome, volumeAudio, durataAudio);
                    break;

                case 2: //Video nome, volume, durata, luminosita
                    System.out.println("Volume iniziale: ");
                    int volumeVideo = tastiera.nextInt();
                    System.out.println("Durata: ");
                    int durataVideo = tastiera.nextInt();
                    System.out.println("La luminosita dello schermo è: ");
                    int luminositaVideo = tastiera.nextInt();
                    lettore[i] = new Video(nome, volumeVideo, durataVideo, luminositaVideo);
                    break;

                case 3: //Immagine nome, luminosita

                    System.out.println("La luminosita dello schermo è: ");
                    int luminositaImmagine = tastiera.nextInt();
                    lettore[i] = new Immagine(nome, luminositaImmagine);
                    break;
            }
        }
    }
}
