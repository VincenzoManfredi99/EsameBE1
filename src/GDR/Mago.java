package GDR;

public class Mago extends Personaggio implements Combattente {

    int potereMagico;
    double mana;
    double danno;


    public Mago(String nome, double hp, int livello, int mana, int potereMagico) {
        super(nome, hp, livello);
        this.mana = mana;
        this.potereMagico = potereMagico;
    }

    public void Medita() {
        mana = mana + 1;
        System.out.println("Hai meditato abbastanza, il tuo mana ora è:" + mana);
    }

    @Override
    public void attacco(Personaggio nemico) {
        danno = (potereMagico * mana * livello) / 5;
        mana = mana - (danno / 3);
        nemico.hp = nemico.hp - danno;
        if (nemico.hp <= 0) {
            System.out.println(nome + " ha sconfitto l'avversario!!");
            livello++;
            System.out.println("Complimenti, ora il tuo livello è: " + livello);
        }
    }
}
