package oopmodeling;

import oopmodeling.universe.BlackHole;

/**
 * @author Guillermo
 * @created 16/10/2026
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
	    BlackHole bh1 = new BlackHole("AlvaroX");
	    System.out.println(bh1);
	    System.out.println(bh1.name);
	    
	    BlackHole bh10 = new BlackHole("GuilleX");
	    System.out.println(bh10);
	    System.out.println(bh10.name);
	    
	    for (int i = 0; i < 10000000; i++) {
	    	new BlackHole("Alex");
	    	try {
	    		Thread.sleep(5);
	    	} catch(InterruptedException e) {
	    		//TODO Auto-generated catch block
	    		e.printStackTrace();
	    	
	    	}
		}//Para capturar potencialmente excepciones
	}
}