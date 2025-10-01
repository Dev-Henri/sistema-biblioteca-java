package entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private Integer id;
	private List<Books> livrosEmprestados;
	
	
	public User(String name, Integer id) {
		this.name = name;
		this.id = id;
		this.livrosEmprestados = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void emprestarLivro(Books livro) {
		if(livro.isDisponivel()) {
			livro.emprestar();
			livrosEmprestados.add(livro);
		}else {
			System.out.println("O livro não está disponível!");
		}
	}
	
	public void devolverLivro(Books livro) {
		if(livrosEmprestados.contains(livro)) {
			livro.devolver();
			livrosEmprestados.remove(livro);
		}else {
			System.out.println("Este usuário não possui este livro.");
		}
	}
	
	public void listarLivros() {
		System.out.printf("Livros emprestados de " , name , ":");
		for(Books l : livrosEmprestados ) {
			System.out.printf("- ", l.getTitulo());
		}
	}
	
	@Override
    public String toString() {
        return "Usuário " 
        		+ id 
        		+ ": " 
        		+ name;
    }
	
	
	
	
	
	
	

}
