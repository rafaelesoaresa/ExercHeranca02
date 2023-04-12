package entidades;

public class LivroDeFiccao extends Livro {
    private String guerra;
	private int subGeneroSpacial;
	

	public LivroDeFiccao(String nomeAutor, String titulo, int numeroDePaginas, String guerra, int subGeneroSpacial) {
		super(nomeAutor, titulo, numeroDePaginas);
		this.guerra = guerra;
		this.subGeneroSpacial = subGeneroSpacial;
		
	}
		@Override
		public void informarDetalhes() {
			super.informarDetalhes();
			System.out.println(this.guerra);
			System.out.println(this.subGeneroSpacial);
			
		}
		
		public boolean verifiarCompatibilidade(int subGeneroSpacial) {
			if( this.subGeneroSpacial == subGeneroSpacial) {
			return true;
			}else {
				return false;
			}
			
		}
	}


