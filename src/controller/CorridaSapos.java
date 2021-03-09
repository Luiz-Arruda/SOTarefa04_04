package controller;

public class CorridaSapos extends Thread {
	
	private double distancia;
	private int ops;
	double [] resultado = new double [6];
	
	public CorridaSapos(double distancia, int ops) {
		this.distancia = distancia;	
		this.ops = ops;
		}


	@Override
	public void run() {
		
		corridaSapos();
	} 
	

	
	public void corridaSapos() {
		double numSapo = 0.0;
		double distSaltada = 0.0;
		double salto = 0.0;
		double tempoInicial = 0.0;
		double tempoFinal = 0.0;
		double tempoTotal1 = 0.0;
		double tempoTotal2 = 0.0;
		double tempoTotal3 = 0.0;
		double tempoTotal4 = 0.0;
		double tempoTotal5 = 0.0;
		int vencedor = 0;
		
		
		
		 if (ops == 0) {
			while (distSaltada < distancia) {
				salto = (double)(Math.random()*10);
				tempoInicial = System.nanoTime();
				distSaltada += salto;
				tempoFinal = System.nanoTime();
				tempoTotal1 += tempoFinal + tempoInicial;	
				resultado[1] = tempoTotal1;
				System.out.println("Sapo 1; Salto= " + salto + " m / distancia percorrida " + distSaltada + " m");
				} 
			}
		 else if (ops == 2) {
			 while (distSaltada < distancia) {
				 	salto = (double)(Math.random()*10);
					tempoInicial = System.nanoTime();
					distSaltada += salto;
					tempoFinal = System.nanoTime();
					tempoTotal2 += tempoFinal + tempoInicial;	
					resultado[2]= tempoTotal2;
					System.out.println("Sapo 2; Salto= " + salto + " m / distancia percorrida " + distSaltada + " m");
					}   
		 }
		 
		 else if (ops == 3){
			 while (distSaltada < distancia) {
				 	salto = (double)(Math.random()*10);
					tempoInicial = System.nanoTime();
					distSaltada += salto;
					tempoFinal = System.nanoTime();
					tempoTotal3 += tempoFinal + tempoInicial;	
					resultado[3]= tempoTotal3;
					System.out.println("Sapo 3; Salto= " + salto + " m / distancia percorrida " + distSaltada + " m");
			}   
		 }
			
		 else if (ops == 4) {
			 while (distSaltada < distancia) {
				 	salto = (double)(Math.random()*10);
					tempoInicial = System.nanoTime();
					distSaltada += salto;
					tempoFinal = System.nanoTime();
					tempoTotal4 += tempoFinal + tempoInicial;	
					resultado[4]= tempoTotal4;
					System.out.println("Sapo 4; Salto= " + salto + " m / distancia percorrida= " + distSaltada + " m");
					}  
		 }
		 
		 else if (ops ==5 ) {
			 while (distSaltada < distancia) {
				 	salto = (double)(Math.random()*10);
					tempoInicial = System.nanoTime();
					distSaltada += salto;
					tempoFinal = System.nanoTime();
					tempoTotal5 += tempoFinal + tempoInicial;	
					resultado[5]= tempoTotal5;
					System.out.println("Sapo 5; Salto= " + salto + " m / distancia percorrida " + distSaltada + " m");
					}  
		 	}
	
		 }// metodo corrida sapo	
}  // classe

