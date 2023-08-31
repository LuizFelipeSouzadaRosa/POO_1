package Programa_2;

import javax.swing.JOptionPane;

public class Carro {

	String marca;
	int ano;
	String cor;
	
	boolean cadastra() {
		marca = JOptionPane.showInputDialog("Informe a marca do veículo");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veículo"));
		cor = JOptionPane.showInputDialog("Informe a cor do veículo");
		return validaCadastro();
		
	}
	
	boolean validaCadastro() {
		if(marca.equals("")) {
			JOptionPane.showMessageDialog(null, "Marca é obrigatória");
			return false;
		}
		if(cor.equals("")) {
			JOptionPane.showMessageDialog(null, "Cor é obrigatória");
			return false;
			}
		if(ano < 1954 || ano > 2023) {
			JOptionPane.showMessageDialog(null, "Marca é obrigatória");
			return false;
			}
		return true;
	}
	
	String exibirLista() {
		return marca + ", " + ano + ", " + cor + "\n";
	}
	
}
