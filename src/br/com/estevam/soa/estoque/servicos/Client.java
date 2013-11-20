package br.com.estevam.soa.estoque.servicos;

import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		ListagemLivrosService listagemLivrosFactory = new ListagemLivrosService(Client.class.getResource("/livros.wsdl"));
		ListagemLivros listagemLivros = (ListagemLivros) listagemLivrosFactory.getListagemLivrosPort();
		List<Livro> livros = listagemLivros.listarLivrosPaginacao(0,2);
		for(Livro livro : livros){
			System.out.println("Nome: " + livro.getNome());
		}
	}

}
