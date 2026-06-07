package GDR;

public class Personaggio {

    String nome;
    double hp;
    int livello;

    public Personaggio(String nome, double hp, int livello) {
        this.nome = nome;
        this.hp = hp;
        this.livello = livello;
    }

    public void mostraStato() {
        System.out.println("Questo personaggio si chiama: " + nome);
        System.out.println("Ha: " + hp + "HP");
        System.out.println("Il suo livello è: " + livello);
    }
}
