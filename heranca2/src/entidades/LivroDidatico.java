package entidades;

public class LivroDidatico extends Livro {
	private String disciplina;
	private int anoEscolar;
	private String nivelDeEnsino;

	public LivroDidatico(String nomeAutor, String titulo, int numeroDePaginas, String disciplina, int anoEscolar,String nivelDeEnsino) {
		super(nomeAutor, titulo, numeroDePaginas);
		this.disciplina = disciplina;
		this.anoEscolar = anoEscolar;
		this.nivelDeEnsino = nivelDeEnsino;
	}
	
	@Override
	public void informarDetalhes() {
		super.informarDetalhes();
		System.out.println(this.disciplina);
		System.out.println(this.anoEscolar);
		System.out.println(this.nivelDeEnsino);
	}
	
	public boolean verifiarCompatibilidade(int anoEscolar) {
		if( this.anoEscolar == anoEscolar) {
		return true;
		}else {
			return false;
		}
		
	}
}
