package br.cesed.plp.facisa.poll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {
	
    public static void main(String[] args) {
        
        ExecutorService exec = Executors.newFixedThreadPool(4);
    
		exec.execute(new PoolDeThreads(1));
		exec.execute(new PoolDeThreads(2));
		exec.execute(new PoolDeThreads(3));
		exec.execute(new PoolDeThreads(4));
		exec.execute(new PoolDeThreads(5));
		exec.execute(new PoolDeThreads(6));
		exec.execute(new PoolDeThreads(7));
		exec.execute(new PoolDeThreads(8));
		exec.execute(new PoolDeThreads(9));
		exec.execute(new PoolDeThreads(10));
        exec.shutdown();
        
    }
}
