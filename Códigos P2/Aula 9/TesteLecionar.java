public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista profhorista = new ProfessorHorista();
        profhorista.setNome("Rodrigo");
        ProfessorPesquisador profPesq = new ProfessorPesquisador();
        profPesq.setNome("José");
        profhorista.lecionar();
        profPesq.lecionar();
    }
}
