package desafio_medicamento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
    	private static ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
    	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
    	public static void main(String[] args) {
    		int op = 0;
    		do {
    			op = menu();
    			switch (op) {
    			case 1:
    				medicamentos.add(new Medicamento());
    				break;
    			case 2:
    				pessoas.add(new Pessoa());
    				break;
    			case 3:
    		        for (Medicamento medicamento : medicamentos) {
    		        	Pessoa pessoaParaPrescrever = pessoas.get(0);
    		            if (medicamento.getIndicacoes().contains(pessoaParaPrescrever.getSintoma())) {
    		                boolean podePrescrever = true;
    		                for (String condicao : pessoaParaPrescrever.getCondSaude()) {
    		                    if (medicamento.getContraInd().contains(condicao)) {
    		                        podePrescrever = false;
    		                        break;
    		                    }
    		                }
    		                if (podePrescrever) {
    		                    JOptionPane.showMessageDialog(null, "Prescrevendo " + medicamento.getNome() + " para " + pessoaParaPrescrever.getNome());
    		                } else {
    		                	JOptionPane.showMessageDialog(null, "Não é possível prescrever " + medicamento.getNome() + " para " + pessoaParaPrescrever.getNome() +
    		                            " devido a contraindicações.");
    		                }
    		            } else {
    		            	JOptionPane.showMessageDialog(null, medicamento.getNome() + " não é indicado para " + pessoaParaPrescrever.getNome());
    		            }
    		        }
    				break;
    			case 4:
    		        for (Pessoa pessoa : pessoas) {
    		        	JOptionPane.showMessageDialog(null, "Pessoa: " + pessoa.getNome()+"\nSintoma: " + pessoa.getSintoma()+"\nMedicamentos prescritos:");
    		            for (Medicamento medicamento : medicamentos) {
    		                if (medicamento.getIndicacoes().contains(pessoa.getSintoma())) {
    		                    boolean podePrescrever = true;
    		                    for (String condicao : pessoa.getCondSaude()) {
    		                        if (medicamento.getContraInd().contains(condicao)) {
    		                            podePrescrever = false;
    		                            break;
    		                        }
    		                    }
    		                    if (podePrescrever) {
    		                    	JOptionPane.showMessageDialog(null, "- " + medicamento.getNome());
    		                    }
    		                }
    		            }
    		            System.out.println();
    		        }
    				break;
    			case 5:
    				break;


    			}
    		}while(op != 5);
    	}

    	public static int menu() {
    		String menu = "1 - Cadastrar medicamento.\n"
    				+ "2 - Cadastrar pessoa.\n"
    				+ "3 - Fazer a prescrição de medicamentos para uma determinada pessoa.\n"
    				+ "4 - Listar todas as pessoas e seus respectivos medicamentos.\n"
    				+ "5 - Sair";
    		return Integer.parseInt(JOptionPane.showInputDialog(menu));
    	}
}
