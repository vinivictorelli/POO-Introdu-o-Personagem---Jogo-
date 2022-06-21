public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem();
        Personagem guerreiro = new Personagem ();
        guerreiro.nome = "Kent";
        cacador.nome = "John";
        while (true){
            cacador.cacar();
            guerreiro.dormir();
            cacador.comer();
            guerreiro.dormir();
            cacador.dormir();
            guerreiro.dormir();
            cacador.cacar();
            guerreiro.comer();
            cacador.cacar();
            guerreiro.cacar();
            cacador.exibeStatus();
            guerreiro.exibeStatus();
            System.out.println("====================");
            Thread.sleep(3000);
        }
    }
}