public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Kael", "Guerreiro", 2, 90, 50);
        Mago m1 = new Mago("Luna", "Maga", 3, 100, 70, 60);

        // Exibir p1 e m1
        System.out.println(p1);
        System.out.println(m1);

        System.out.println("Nome herdado: " + m1.getNome());

        m1.descansar(20);

        m1.lancarFeitico();
        m1.lancarFeitico();
        m1.lancarFeitico();

        m1.lancarFeitico();

        m1.setMana(150);

        System.out.println("Mana final: " + m1.getMana());
    }
}