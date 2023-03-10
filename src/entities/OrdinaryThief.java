package entities;
import main.Constants; 
import java.util.concurrent.ThreadLocalRandom;

/** 
 * Class that implements the Ordinary Thief entity
 * @author 89078 - Luis Couto
 * @author 89082 - Antonio Ferreira
 */

public class OrdinaryThief extends Thread {

	/**
	 * Ordinary Thief identification number
	 */
	private int id;	
	
	/**
	 * Ordinary Thief state
	 */
	private int state;	
	
	/**
	 * Ordinary Thief displacement
	 */
	private int displacement;	
	
	/**
	 * Indicates if Ordinary Thief is carrying a canvas <br>
	 * 0 - Empty hands  <br>
	 * 1 - Carrying canvas  <br>
	 */
	private int carryingCanvas;	
	
	/**
	 * Ordinary Thief current position <br>
	 */
	private int currentPos;	
	
	/**
	 * Ordinary Thief current situation <br>
	 * 'W' - Waiting to join an assault party  <br>
	 * 'P' - In an assault party  <br>
	 */
	private char currentSit;	
	
	/** 
	 * Instantiation of a Ordinary Thief thread <br>
	 * @param id - ID number of the thief
	 * 
	 */
	public OrdinaryThief(int id) {
		super("Thief " + id);
		this.id = id;
		this.state = OrdinaryStates.CONCENTRATION_SITE;
		this.displacement = ThreadLocalRandom.current().nextInt(Constants.MIN_DISPLACEMENT, Constants.MAX_DISPLACEMENT + 1);
		this.carryingCanvas = 0;
		this.currentPos = -1;
		this.currentSit = 'W';
	}

	/**
	 * Life cycle of the Ordinary Thief
	 */
	@Override
	public void run() {
		
	}
	
}
