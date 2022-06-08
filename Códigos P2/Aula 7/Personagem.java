public class Personagem {
    String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    
    void cacar (){ 
        if (energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2; 
        } 
    
    else{
        System.out.println(nome + " sem energia para cacar");
    }
        fome = Math.min (fome + 1, 10);
        sono = Math.min (sono + 1, 10);
    
    }
    
    void comer (){
        if (fome >= 1){
            System.out.println(nome + " comendo.");
            energia = Math.min (energia + 1, 10);
            fome -= 1;
        }
    
    else{
        System.out.println(nome + " sem fome.");
        } 
    }
    
    void dormir (){
        if (sono >= 1){
            System.out.println(nome + " dormindo.");
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
    
    else{
        System.out.println(nome + " sem sono.");
        } 
    }

    public Personagem (int energia, int fome, int sono){
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
            if (sono >= 0 && sono <= 10)
                this.sono = sono;
    }

    private String nome;
    public Personagem(String nome, int energia, int fome, int sono) {
        this.nome = nome;
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    public Personagem(String nome, int energia, int fome, int sono) {
        this (energia, fome, sono);
        this.nome = nome;
       }
}