package DesafioJogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Programa_2.Carro;

public class Principal {
	
	public static void main(String[] args) {
		
		ArrayList<Time> times = new ArrayList<Time>();
		String menu = "1 - Cadastrar novo time\n"
				+ "2 - Listar times\n"
				+ "3 - Verificiar artilheiro do campeonato\n"
				+ "4 - Verificiar time com mais gols do campeonato\n"
				+ "5 - Sair";
		
		int op = 0;
		
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				Time t = new Time();
				t.cadastrar();
				times.add(t);
			}
			
			if(op == 2) {
				String result = "Times cadastrados\n\n";
				for(Time t: times) {
					result += t.exibir();
				}
				JOptionPane.showMessageDialog(null, result);
			}
			
			if(op == 3) {
		        Jogador artilheiro = null;
		        int maxGols = 0;
		        for (Time time : times) {
		            Jogador artilheiroTime = time.artilheiroTime();
		            if (artilheiroTime != null && artilheiroTime.getGols() > maxGols) {
		                artilheiro = artilheiroTime;
		                maxGols = artilheiroTime.getGols();
		            }
		        }
		        if (artilheiro != null) {
		            JOptionPane.showMessageDialog(null, "Artilheiro: " + artilheiro.getNome() + " - Gols: " + artilheiro.getGols());
		        }
			}
			
			if(op == 4) {
				Time timeMaisGols = null;
		        int maxGolsTime = 0;
		        for (Time time : times) {
		            int totalGolsTime = time.getTotalGols();
		            if (totalGolsTime > maxGolsTime) {
		                timeMaisGols = time;
		                maxGolsTime = totalGolsTime;
		            }
		        }
		        if (timeMaisGols != null) {
		            JOptionPane.showMessageDialog(null, "Time com mais gols: " + timeMaisGols.getNome() + " - Gols: " + maxGolsTime);
		        }
			}
			
		}while(op != 5);

	}
	
}