package DesafioLivro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Livro> livros = new ArrayList<Livro>();
		String menu = "1 - Cadastrar novo livro\n"
				+ "2 - Listar livros\n"
				+ "3 - \n"
				+ "4 - \n"
				+ "5 - Sair";
		
		int op = 0;
		
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				Livro l = new Livro();
				l.cadastrar();
				livros.add(l);
			}
			
			if(op == 2) {
				String result = "Livros cadastrados\n\n";
				for(Livro l: livros) {
					result += l.exibir();
				}
				JOptionPane.showMessageDialog(null, result);
			}
			
			if(op == 3) {
				buscaPorAutor();
			}
			
			if(op == 4) {

			}
			
		}while(op != 5);

	}
	
	static void buscaPorAutor(ArrayList<Livro> livros) {
		String autor = JOptionPane.showInputDialog("Autor:");
		String dados = "";
		for( Livro l : livros ) {
			if(l.getAutorores().equalsIgnoreCase(autor)) {
				dados += l.exibirAutor();
			}
		}
		JOptionPane.showMessageDialog(null, dados);
	}

}
