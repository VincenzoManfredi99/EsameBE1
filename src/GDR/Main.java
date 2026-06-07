package GDR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        Personaggio[] sfidanti = new Personaggio[3];

        for (int i = 0; i < sfidanti.length; i++) {
            System.out.print("Scegli il tipo (1=Guerriero, 2=Mago, 3=Mercante): ");
            int sceltaTipo = tastiera.nextInt();
            tastiera.nextLine();

            System.out.print("Inserisci il nome: ");
            String nome = tastiera.nextLine();
            System.out.print("Inserisci gli HP: ");
            double hp = tastiera.nextDouble();
            System.out.print("Inserisci il livello: ");
            int livello = tastiera.nextInt();

            switch (sceltaTipo) {
                case 1: // GUERRIERO
                    System.out.print("Inserisci forza: ");
                    int forza = tastiera.nextInt();
                    System.out.print("Inserisci resistenza: ");
                    int resistenza = tastiera.nextInt();
                    sfidanti[i] = new Guerriero(nome, hp, livello, forza, resistenza, 0);
                    break;

                case 2: // MAGO
                    System.out.print("Inserisci mana: ");
                    int mana = tastiera.nextInt();
                    System.out.print("Inserisci potere magico: ");
                    int potere = tastiera.nextInt();
                    sfidanti[i] = new Mago(nome, hp, livello, mana, potere);
                    break;

                case 3: // MERCANTE
                    System.out.print("Inserisci ricchezza: ");
                    int ricchezza = tastiera.nextInt();
                    System.out.print("Inserisci oggetti in inventario: ");
                    int inventario = tastiera.nextInt();
                    sfidanti[i] = new Mercante(nome, hp, livello, ricchezza, inventario);
                    break;
            }
        }

    }
}

