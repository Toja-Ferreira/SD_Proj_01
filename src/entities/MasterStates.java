package entities;

/** 
 * Class that contains the Master Thief states
 * @author 89078 - Luis Couto
 * @author 89082 - Antonio Ferreira
 */

public class MasterStates {
	
	/**
	 * <strong> Transitional state (initial) </strong> <br>
	 * */
	public static final int PLANNING_THE_HEIST = 1;
	
	/**
	 * <strong> Transitional state with eventual waiting </strong> <br>
	 * The master thief proceeds if the next operation is takeARest and blocks if it is one
	 * of the other two and there is not a sufficient number of ordinary thieves available 
	 * (the totality for sumUpResults and enough to create an assault party for prepareAssaultParty) <br>
	 * When the master thief blocks, she is waken up by the operation amINeeded of an ordinary thief 
	 * */
	public static final int DECIDING_WHAT_TO_DO = 2;
	
	/**
	 * <strong> Blocking state </strong> <br>
	 * The master thief is waken up by the operation prepareExcursion of the last of the ordinary 
	 * thieves to join the party <br>
	 * */
	public static final int ASSEMBLING_A_GROUP = 3;
	
	/**
	 * <strong> Blocking state </strong> <br>
	 * The master thief is waken up by the operation handACanvas of one of the assault 
	 * party members returning from the museum <br>
	 * */
	public static final int WAITING_FOR_GROUP_ARRIVAL = 4;
	
	/**
	 * <strong> Final state </strong> <br>
	 * */
	public static final int PRESENTING_THE_REPORT = 5;
	
}
