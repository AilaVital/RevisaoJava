public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, String tipo, int nivel, int vida, int energia, int forca) {
        super(nome, tipo, nivel, vida, energia);
        this.forca = forca;
    }

    public int getForca() {
        return this.forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}