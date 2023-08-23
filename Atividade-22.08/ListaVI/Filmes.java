package Java.src.poo.atividade_2208.listaVI.model;

class Filmes extends Publicacao {
    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private int tempoDuracao;
    
    public Filmes(String titulo, String autor, int anoPublicacao, String genero, String editora, int qntDisponivel,
                 String diretor, String atorPrincipal, String sinopse, int tempoDuracao) {
                    
        super(titulo, autor, anoPublicacao, genero, editora, qntDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }
    
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println( "Diretor: " + diretor +
                            "\nAtor Principal: " + atorPrincipal +
                            "\nSinopse: " + sinopse +
                            "\nDuração: " + tempoDuracao + " minutos");
    }
}
