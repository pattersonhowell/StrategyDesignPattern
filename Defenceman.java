import java.util.Random;
/**
 * @author pattersonhowell
 * Class inherits from Player class
 */
public class Defenceman extends Player {
	
	public static final int OPTIONS = 10;
	public static final int OPTIONSb = 2;
	
	/**
	 * @param name
	 * Constructor calls from parent class
	 */
	public Defenceman(String name) {
		super(name);
	}
	
	/**
	 * sets offence behavior to a pass behavior 9 times out of 10
	 */
	@Override public void setOffenceBehavior() {
		
		Random rand = new Random();
		int r = rand.nextInt(OPTIONS);
		if(r == 0) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 1) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 2) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 3) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 4) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 5) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 6) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 7) {
			offenceBehavior = new PassBehavior();
		}
		else if(r == 8) {
			offenceBehavior = new PassBehavior();
		}
		else  {
			offenceBehavior = new SlapShotBehavior();
		}
		
	}
	
	/**
	 * sets defence behavior to either a chase puck behavior or block behavior
	 */
	@Override public void setDefenceBehavior() {
		
		Random rand = new Random();
		int r = rand.nextInt(OPTIONSb);
		
		if(r == 0) {
			defenceBehavior = new ChasePuckBehavior();
		}
		else {
			defenceBehavior = new BlockBehavior();
		}
	}
	
	/**
	 * displays player's name and position
	 */
	public String toString() {
		return name + " plays the position: Defenceman";
	}


}
