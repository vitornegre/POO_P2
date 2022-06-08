public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem();
        Personagem soneca = new Personagem ();
        soneca.nome = "Soneca";
        cacador.nome = "John";
        while (true){
            cacador.cacar();
            soneca.dormir();
            cacador.comer();
            soneca.dormir();
            cacador.dormir();
            soneca.dormir();
            cacador.cacar();
            soneca.comer();
            cacador.cacar();
            soneca.cacar();
            System.out.println("====================");
            Thread.sleep(3000);
    
        }

        Personagem cacador = new Personagem(10, 0, 0);
        Personagem soneca = new Personagem (2, 6, 4);
        
    }
}
   