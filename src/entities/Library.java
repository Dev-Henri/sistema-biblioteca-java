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
	
	public User buscarUsuarioPorId(int id) {
		for(User u : usuarios) {
			if(u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	
	public Books buscarLivroPorTitulo(String titulo) {
		for(Books l : livros) {
			if(l.getTitulo().equalsIgnoreCase(titulo)) {
				return l;
			}
		}
		return null;
	}
	
	public void listarLivrosDisponiveis() {
		System.out.println("Livros disponíveis:");
		for(Books l : livros) {
			if(l.isDisponivel()) {
				System.out.println("- " + l.getTitulo() + "(autor: " + l.getAutor() + ")");
			}
		}
	}
}
