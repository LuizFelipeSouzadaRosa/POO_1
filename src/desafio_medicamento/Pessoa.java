package desafio_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private String sintoma;
	private ArrayList<String> condSaude = new ArrayList<String>();
	private ArrayList<String> Medicamentos = new ArrayList<String>();
	
	public Pessoa() {
		cadastra();
	}
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome da pessoa"));
		setSintoma(JOptionPane.showInputDialog("Sintoma da pessoa"));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public ArrayList<String> getCondSaude() {
		return condSaude;
	}
	public void setCondSaude(ArrayList<String> condSaude) {
		this.condSaude = condSaude;
	}
	public ArrayList<String> getMedicamentos() {
		return Medicamentos;
	}
	public void setMedicamentos(ArrayList<String> medicamentos) {
		Medicamentos = medicamentos;
	}
	
	
	

}
