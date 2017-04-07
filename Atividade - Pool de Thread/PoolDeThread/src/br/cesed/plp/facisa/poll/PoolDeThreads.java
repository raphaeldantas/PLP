package br.cesed.plp.facisa.poll;

public class PoolDeThreads implements Runnable {

	
	  private int numero;
	  
	    PoolDeThreads(int number) {
	        numero = number;
	    }

	    public void run() {
	        for (int i=0; i<=100; i+=20) {
	            
	            System.out.println("Trabalhando com a Thread: "
	                + numero
	                + ", Percentual completo: " + i + "%");
	            try {
	                Thread.sleep((int)(Math.random() * 1000));
	            } catch (InterruptedException e) {
	            }
	        }
	    }
	}

