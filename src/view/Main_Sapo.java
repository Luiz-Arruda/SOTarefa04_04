package view;

import javax.swing.JOptionPane;

import controller.CorridaSapos;

public class Main_Sapo {

	public static void main(String[] args) {
		
		double distancia = 0.0;
		
		distancia =Integer.parseInt(JOptionPane.showInputDialog("Informa a distancia da corrida: "));
		
		for (int op = 0; op <= 5; op ++) {
			CorridaSapos corridaSapos = new CorridaSapos(distancia, op);
			corridaSapos.start();
		}
	}
}
