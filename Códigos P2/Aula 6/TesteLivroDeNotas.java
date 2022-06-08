import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
    public static void main(String[]args){
        String primeiroCurso = JOptionPane.showInputDialog("Prof, qual o nome do curso? ");
        String segundoCurso = JOptionPane.showInputDialog("Prof, qual o nome do segundo curso?");
        
        LivroDeNotas livroDeNotas1 = new LivroDeNotas(primeiroCurso);
        LivroDeNotas livroDeNotas2 = new LivroDeNotas(segundoCurso);

        livroDeNotas1.exibirMensagem();
        livroDeNotas2.exibirMensagem();
    }
    
}
