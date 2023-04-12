package entidades;

public class Livro {
	private String nomeAutor;
	private String titulo;
    private int numeroDePaginas;
   
    
   public Livro(String nomeAutor, String titulo, int numeroDePaginas) {
	   this.nomeAutor = nomeAutor;
	   this.titulo = titulo;
	   this.numeroDePaginas = numeroDePaginas;
   }
   
   public void informarDetalhes() {
	   System.out.println(this.nomeAutor);
   	   System.out.println(this.titulo);
   	System.out.println(this.numeroDePaginas);
   }
}
