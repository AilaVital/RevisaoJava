public class Mago extends Personagem {
    private int mana;

    public Mago(String nome, String tipo, int nivel, int vida, int energia, int mana) {
        super(nome, tipo, nivel, vida, energia);
        setMana(mana);
    } 

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        if (mana >= 0 && mana <= 100) {
            this.mana = mana;
        } else {
            System.out.println("Valor invalido para mana! Deve estar entre 0 e 100.");
        }
    }

    public void lancarFeitico() {
        if (mana >= 20) {
            mana = mana - 20;
            System.out.println(getNome() + " lançou um feitiço!");
        } else {
            System.out.println("Mana insuficiente!");
        }
    }
}