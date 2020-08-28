/**
 * @author pattersonhowell
 * Abstract Base Class 
 */
public abstract class Player {
	/**
	 * Attributes of a player
	 */
	protected String name;
	private boolean offence = true;
    protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/**
	 * Constructor that sets name of player and calls set methods for offence and defence
	 * @param name
	 */
	public Player(String name) {
		this.name = name;
		setOffenceBehavior();
		setDefenceBehavior();
	}
	
	/**
	 * abstract methods that are inherited by subclasses
	 */
	public abstract void setDefenceBehavior(); 
	
	public abstract void setOffenceBehavior(); 
		
	/**
	 * method to display what each player decides to do on offence or defence
	 * @return
	 */
	public String play() {
		if(this.offence == true) {
			return offenceBehavior.play();
		}
		else {
			return defenceBehavior.play();
		}
	}
	
	/**
	 * switches from offence to defence or vice versa
	 */
	public void turnover() {
		if(this.offence == true) {
			this.offence = false;
		}
		else {
			this.offence = true;
		}
	}
	
}
