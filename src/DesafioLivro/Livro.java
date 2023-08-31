package DesafioLivro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {
	
	private String titulo;
	private double preco;
	private ArrayList<Autor> autores = new ArrayList<Autor>();

	public void cadastrar() {
		setTitulo(JOptionPane.showInputDialog("Título do livro"));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço do livro")));
		String continua = "";
		do {
			Autor a = new Autor();
			a.cadastraAutor();
			autores.add(a);
			continua = JOptionPane
					.showInputDialog("Mais autores? S/N");
		}while(continua.equalsIgnoreCase("S"));
	}
	
	public String exibir() {
		String dados = "*** " + getTitulo() + ", R$" + getPreco() + "***\n";
		for(Autor a: autores) {
			dados += a.exibirAutor();
		}
		return dados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Autor> getAutorores() {
		return autores;
	}

	public void setAutorores(ArrayList<Autor> autorores) {
		this.autores = autorores;
	}
	
	

}
