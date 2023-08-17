package Programa_1;

import javax.swing.JOptionPane;

public class PrincipalImc {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qtd. Pessoa?"));
		
		Pessoa pessoas[] = new Pessoa[n];
		String resultado = "";
		
		for(int i=0; i<n; i++) {
			Pessoa p = new Pessoa();
			p.cadastra();
			pessoas[i] = p;
			resultado += p.exibirDAdos();
		}
		JOptionPane.showMessageDialog(null, resultado);
	}

}
