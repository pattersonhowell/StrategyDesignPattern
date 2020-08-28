import java.util.Random;
/**
 * @author pattersonhowell
 * Class implements from both OffenceBehavior and DefenceBehavior interfaces
 */
public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {

	public static final int OPTIONS = 4;
	
	/**
	 * displays one of four random decisions for a BlockGoalBehavior
	 */
	@Override public String play() {
		Random rand = new Random();
		int r = rand.nextInt(OPTIONS);
		if(r == 0) {
			return "hand blocks the puck";
		}
		else if(r == 1) {
			return "catches the puck";
		}
		else if(r == 2) {
			return "blocks puck with knee pads";
		}
		else {
			return "blocks puck with stick";
		}
			
	}
	
}
