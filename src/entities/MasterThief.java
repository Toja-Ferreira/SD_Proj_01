package entities;

/** 
 * Class that implements the Master Thief entity
 * @author 89078 - Luis Couto
 * @author 89082 - Antonio Ferreira
 */

public class MasterThief extends Thread {
	
	/**
	 * Master Thief state
	 */
	private int state;	
	
	/** 
	 * Instantiation of a Master Thief thread <br>
	 */
	public MasterThief() {
		super("MstT");
		this.state = MasterStates.PLANNING_THE_HEIST;
	}
	
	/**
	 * Life cycle of the Master Thief
	 */
	@Override
	public void run() {
		
	}

}
