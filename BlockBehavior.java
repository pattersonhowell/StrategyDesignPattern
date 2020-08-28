import java.util.Random;
/**
 * @author pattersonhowell
 * Class implements from DefenceBehavior interface
 */
public class BlockBehavior implements DefenceBehavior {

	public static final int OPTIONS = 3;
	
	/**
	 * displays one of three random decisions for what a BlockBehavior does
	 */
	@Override public String play() {
		Random rand = new Random();
		int r = rand.nextInt(OPTIONS);
		if(r == 0) {
			return "blocks player from passing";
		}
		else if(r == 1) {
			return "blocks player from shooting";
		}
		else {
			return "checks player with puck";
		}
		
	}
	
}
