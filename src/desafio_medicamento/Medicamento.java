package desafio_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Medicamento {
	
	private String nome;
	private String adm;
	private ArrayList<String>ContraInd = new ArrayList<String>();
	private ArrayList<String>Indicacoes = new ArrayList<String>();
	
	public Medicamento() {
		cadastra();
	}
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do medicamento"));
		setAdm(JOptionPane.showInputDialog("Qual a administração"));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAdm() {
		return adm;
	}
	public void setAdm(String adm) {
		this.adm = adm;
	}
	public ArrayList<String> getContraInd() {
		return ContraInd;
	}
	public void setContraInd(ArrayList<String> contraInd) {
		ContraInd = contraInd;
	}
	public ArrayList<String> getIndicacoes() {
		return Indicacoes;
	}
	public void setIndicacoes(ArrayList<String> indicacoes) {
		Indicacoes = indicacoes;
	}
}
