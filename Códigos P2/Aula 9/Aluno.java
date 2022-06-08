public  class Aluno extends Pessoa{
    public Aluno(){
        System.out.println("Construindo Aluno...");
    }
    public Aluno(){
        super();
        System.out.println("Construindo Aluno...");
    }
    public Aluno (){
        super("Maria", 19);
        System.out.println("Construindo Aluno...");
    }
    public Aluno(String nome, int idade){
        super(nome, idade);
        System.out.println("Construindo Aluno...");
    }
    public Aluno (String nome, int idade){
        System.out.println("Construindo Aluno...");
        super(nome, idade);
    }
}
