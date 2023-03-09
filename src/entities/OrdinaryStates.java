package entities;

/** 
 * Class that contains the Ordinary Thief states
 * @author 89078 - Luis Couto
 * @author 89082 - Antonio Ferreira
 */

public class OrdinaryStates {
	
	/**
	 * <strong> Blocking state (initial / final state) </strong> <br>
	 * The ordinary thief is waken up by one of the following operations of the master thief:
	 * prepareAssaultParty (during heist operations) or sumUpResults (at the end of the heist)
	 * */
	public static final int CONCENTRATION_SITE = 1;
	
	/**
	 * <strong> Transitional state with eventual waiting </strong> <br>
	 * For the crawling in movement to start, the first party member is waken up by
	 * the operation sendAssaultParty of master thief <br>
	 * The ordinary thief proceeds until the target room at the museum is reached and
	 * blocks if he can not generate a new increment of position (before blocking, he
	 * wakes up the fellow party member that is just behind him in the crawling queue,
	 * or the first one still crawling, if he is the last) <br>
	 * When blocking occurs, the ordinary thief is waken up by the operation of crawlIn of a fellow party member
	 * */
	public static final int CRAWLING_INWARDS = 2;
	
	/**
	 * <strong> Transitional state </strong>
	 * */
	public static final int AT_A_ROOM = 3;
	
	/**
	 * <strong> Transitional state with eventual waiting </strong> <br>
	 * For the crawling out movement to start, the first party member is waken up by
	 * the operation reverseDirection of the last party member to decide to leave the room <br>
	 * The ordinary thief proceeds until he reaches the outside gathering site and 
	 * blocks if he can not generate a new increment of position (before blocking, he
	 * wakes up the fellow party member that is just behind him in the crawling
	 * queue, or the first one still crawling, if he is the last) <br>
	 * When blocking occurs, the ordinary thief is waken up by the operation of crawlOut of a fellow party member
	 * */
	public static final int CRAWLING_OUTWARDS = 4;
	
	/**
	 * <strong> Blocking state </strong> <br>
	 * The ordinary thief is waken up by the operation of the master thief: collectACanvas
	 * (when she receives the canvas taken from the museum) or when she gets the report that the room is already empty
	 * */
	public static final int COLLECTION_SITE = 5;
	
}
