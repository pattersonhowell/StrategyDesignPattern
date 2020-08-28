import java.util.Random;
/**
 * @author pattersonhowell
 * Class inherits from Player class
 */
public class Forward extends Player {

	public static final int OPTIONS = 2;	

	/**
	 * Constructor calls from parent class
	 * @param name
	 */
	public Forward(String name) {
		super(name);
	}
	
	/**
	 * sets offence between a pass behavior or shoot behavior
	 */
	@Override public void setOffenceBehavior() {
		
		Random rand = new Random();
		int r = rand.nextInt(OPTIONS);
		if(r == 0) {
			offenceBehavior = new PassBehavior();
		}
		else {
			offenceBehavior = new ShootBehavior();
		}
	}
	
	/**
	 * sets defence between a chase puck behavior or block behavior
	 */
	@Override public void setDefenceBehavior() {
		
		Random rand = new Random();
		int r = rand.nextInt(OPTIONS);
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
		return name + " plays the position: Forward";
	}

	
	
}
