package entities;

public class Books {
	
	private String titulo;
	private String autor;
	private Integer ano;
	private boolean disponivel;
	
	public Books () {
	}

	public Books(String titulo, String autor, Integer ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.disponivel = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public boolean isDisponivel() {
	    return disponivel;
	}
	
	public void emprestar() {
		if(disponivel) {
			disponivel = false;
			System.out.printf("Livro \"" , titulo, "emprestado com sucesso!\"");
		}else {
			System.out.printf("Livro \"" , titulo, "não está disponivel.\"");
		}
	}
	
	public void devolver() {
		disponivel = true;
		System.out.printf("Livro \"" , titulo, "devolvido com sucesso!.\"");
	}
	
	@Override
    public String toString() {
        return titulo 
        		+ " - " 
        		+ autor 
        		+ " (" + ano + ") " 
        		+ (disponivel ? "[Disponível]" : "[Indisponível]");
    }

	
	
	

	
	
	


	
	
	
	
	
	
	
	

}
