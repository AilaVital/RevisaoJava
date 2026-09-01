public class Personagem {
    private String nome;
    private String tipo;
    private int nivel;
    private int vida;
    private int energia;

    public Personagem(String nome, String tipo, int nivel, int vida, int energia) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void descansar(int quantidade) {
        this.energia += quantidade;
        System.out.println(nome + " descansou e recuperou " + quantidade + " de energia!");
    }

    @Override
    public String toString() {
        return "Personagem: " + nome + " | Tipo: " + tipo + " | Nivel: " + nivel + " | Vida: " + vida + " | Energia: " + energia;
    }
}