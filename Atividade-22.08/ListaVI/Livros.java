package Java.src.poo.atividade_2208.listaVI.model;

class Livros extends Publicacao {
   private int edicao;
   private String isbn;
   
   public Livros(String titulo, String autor, int anoPublicacao, String genero, String editora, int qntDisponivel, int edicao, String isbn) {
      super(titulo, autor, anoPublicacao, genero, editora, qntDisponivel);
      this.edicao = edicao;
      this.isbn = isbn;
   }

   public void imprimeDados() {
      super.imprimeDados();
      System.out.println("Edição: " + edicao + "\nISBN: " + isbn);
   }
}
