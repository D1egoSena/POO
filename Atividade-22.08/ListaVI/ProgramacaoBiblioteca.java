package Java.src.poo.atividade_2208.listaVI.model;

public class ProgramacaoBiblioteca {
    public static void main(String[] args) {

        Livros livro = new Livros("Sherlock Holmes", "Arthur Doyle", 2023, "Mistério", 
                                    "+Livros", 50, 3, "027483726");

        Filmes filme = new Filmes("Batman", "Bill Finger", 2022, "Ação", "Warner", 100,
                                "Matt Reeves", "Bruce Wayne", "Filme de super-heroi baseado no personagem Batman.", 175);
        
        Publicacao[] acervo = new Publicacao[2];
        acervo[0] = livro;
        acervo[1] = filme;
        
        for (Publicacao publicacao : acervo) {
            publicacao.imprimeDados();
            System.out.println("\n");
        }
    }
// Foi possível adicionar no array os objetos livros e filmes pois eles são subclasses de Publicação.
// Pois foi utilizado o método de herançaa.
}
