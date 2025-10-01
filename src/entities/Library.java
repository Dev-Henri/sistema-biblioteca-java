package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Books> livros;
	private List<User> usuarios;
	
	public Library() {
		this.livros = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}
	
	public List<Books> getBooks(){
		return livros;
	}
	
	public List<User> getUser(){
		return usuarios;
	}
	
	public void adicionarLivro(Books livro) {
		livros.add(livro);
	}
	
	public void cadastrarUsuario(User usuario) {
		usuarios.add(usuario);
	}
	
	public void listarLivrosDisponivel() {
		System.out.println("Livros disponíveis:");
		for(Books l : livros) {
			if(l.isDisponivel()) {
				System.out.printf("- ", l);
			}
		}
	}
}
