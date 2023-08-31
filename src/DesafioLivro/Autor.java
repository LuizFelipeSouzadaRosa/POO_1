package DesafioLivro;

import javax.swing.JOptionPane;

public class Autor {
	
	String nomeAutor;
	private String sexoAutor;
	private int idadeAutor;
	
	void cadastraAutor() {
		setNomeAutor (JOptionPane.showInputDialog("Informe o nome do autor:"));
		setSexoAutor (JOptionPane.showInputDialog("Informe o sexo do autor:"));
		setIdadeAutor (Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do autor:")));
		
	}
	
	String exibirAutor() {
		return nomeAutor + ", idade:" + idadeAutor + ", sexo:" + sexoAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getSexoAutor() {
		return sexoAutor;
	}

	public void setSexoAutor(String sexoAutor) {
		this.sexoAutor = sexoAutor;
	}

	public int getIdadeAutor() {
		return idadeAutor;
	}

	public void setIdadeAutor(int idadeAutor) {
		this.idadeAutor = idadeAutor;
	}
	
	

}
