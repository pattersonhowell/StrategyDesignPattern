/**
 * @author pattersonhowell
 * Class inherits from Player class
 */
public class Goalie extends Player {
	
	/**
	 * Constructor calls from parent class
	 * @param name
	 */
	public Goalie (String name) {
		super(name);
	}
	
	/**
	 * sets offence to a block goal behavior
	 */
	@Override public void setOffenceBehavior() {
		offenceBehavior = new BlockGoalBehavior();
	}
	
	/**
	 * sets defence to a block goal behavior
	 */
	@Override public void setDefenceBehavior() {
		defenceBehavior = new BlockGoalBehavior();
	}
	
	/**
	 * displays player's name and position
	 */
	public String toString() {
		return name + " plays the position: Goalie";
	}


}
