package application;

import java.util.Scanner;

import entities.Books;
import entities.Library;
import entities.User;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library biblioteca = new Library();
		
		boolean rodando = true;
		while(rodando) {
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Cadastrar Usuário");
			System.out.println("3 - Emprestar Livro");
			System.out.println("4 - Devolver Livro");
			System.out.println("5 - Listar livros disponiveis");
			System.out.println("6 - Sair");
			System.out.print("Escolha uma das opções: ");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			System.out.println();
			if(opcao == 1) {
				System.out.print("Informe o Titulo: ");
				String titulo = sc.nextLine();
				System.out.print("Informe o Autor: ");
				String autor = sc.nextLine();
				System.out.print("Informe o Ano: ");
				int ano = sc.nextInt();
				
				Books novoLivro = new Books(titulo, autor, ano);
				biblioteca.adicionarLivro(novoLivro);
				System.out.println();
				System.out.println("\"Livro cadastrado com sucesso!\"");
				System.out.println();
				
			}else if(opcao == 2) {
				System.out.print("Informe o nome do Usuário: ");
				String nome = sc.nextLine();
				System.out.print("Informe o ID do usuário: ");
				int id = sc.nextInt();
				
				User novoUsuario = new User(nome, id);
				biblioteca.cadastrarUsuario(novoUsuario);
				System.out.println();
				System.out.println("\"Usuário cadastrado com sucesso!\"");
				System.out.println();
				
			}else if(opcao == 3) {
				System.out.print("informe o Id do usuario: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Informe o titulo do livro: ");
				String titulo = sc.nextLine();
				
				User usuario = biblioteca.buscarUsuarioPorId(id);
				Books livro = biblioteca.buscarLivroPorTitulo(titulo);
				
				System.out.println();
				if(usuario != null && livro != null) {
					usuario.emprestarLivro(livro);
				}else {
					System.out.println("\"Usuário ou livro não encontrado!\"");
				}
				System.out.println();
			}else if(opcao == 4) {
				System.out.print("informe o Id do usuario: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Informe o titulo do livro: ");
				String titulo = sc.nextLine();
				
				User usuario = biblioteca.buscarUsuarioPorId(id);
				Books livro = biblioteca.buscarLivroPorTitulo(titulo);
				
				System.out.println();
				if(usuario != null && livro != null) {
					usuario.devolverLivro(livro);
				}else {
					System.out.println("\"Usuário ou livro não encontrado!\"");
				}
				System.out.println();
			}else if(opcao == 5) {
				biblioteca.listarLivrosDisponiveis();
				System.out.println();
			}else if(opcao == 6) {
				rodando = false;
				System.out.println("\"Encerrando sistema...\"");
			}else {
				System.out.println("\"Opção inválida! Tente novamente.\"");
			}	
		}
		
		
		sc.close();

	}

}