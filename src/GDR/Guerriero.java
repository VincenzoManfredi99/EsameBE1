package GDR;

public class Guerriero extends Personaggio implements Combattente {
    int forza;
    int resistenza;
    double danno;

    public Guerriero(String nome, double hp, int livello, int forza, int resistenza, double danno) {
        super(nome, hp, livello);
        this.forza = forza;
        this.resistenza = resistenza;
        this.danno = danno;

    }

    public void allenamento() {
        resistenza = resistenza + 1;
        System.out.println("Ti sei allenato duramente, ora la tua resistenza è:" + resistenza);
    }

    @Override
    public void attacco(Personaggio nemico) {
        danno = (forza * resistenza * livello) / 10;
        nemico.hp = nemico.hp - danno;
        hp = hp - (danno / 5);

        if (nemico.hp <= 0) {
            System.out.println(nome + "Ha sconfitto l'aversario!!");
            livello++;
            System.out.println("Complimenti, ora il tuo livello è: " + livello);
        }
    }
}
