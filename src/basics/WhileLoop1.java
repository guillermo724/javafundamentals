package basics;
/**
 * Imagine the following scenario:
 * In the game, a intelligent monster
 * need to launch an attack depending on
 * the distance between the player
 * and itself,
 * and also its heath state.
 * 
 * 
 * Sep 24, 2026
 * cepv
 */
public class WhileLoop1 {
	
	public static void main(String[] args) {
		int distance = 20;
		int hp = 234;
		final int MAX_HP = 234234;
		boolean isRunning = true;
		while(isRunning) {
			if(distance < 20) {
				if(hp >= MAX_HP / 2) {
					System.out.println("attack");
				}
			
		    }
			else {//si no, o sea "distance >= 20"
				System.out.println(
						"I am going to go to my bed");
	        }
		    break;
      }
   }
}
