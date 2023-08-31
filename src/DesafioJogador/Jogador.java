package DesafioJogador;

import javax.swing.JOptionPane;

public class Jogador {
	
	private String nome;
	private int camisa;
	private int gols;
	
	void cadastrar() {
		setNome (JOptionPane.showInputDialog("Nome do jogador:"));
		setCamisa (Integer.parseInt(JOptionPane.showInputDialog("Camisa:")));
		setGols (Integer.parseInt(JOptionPane.showInputDialog("Gols:")));
	}
	
	String exibir() {
		return getNome()+"-"+getCamisa()+"-"+getGols()+"\n";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
}
