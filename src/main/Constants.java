package main;

/** 
 * Class that contains the definition of the simulation parameters <br>
 * May be customized to use other parameter values 
 * @author 89078 - Luis Couto
 * @author 89082 - Antonio Ferreira
 */

public class Constants {
	
	/**
	 * Total number of existing thieves, including the master thief <br>
	 * */
	public static final int NUM_THIEVES = 7;
	
	/**
	 * Number of ordinary thieves in each assault party <br>
	 * */
	public static final int ASSAULT_PARTY_SIZE = 3;
	
	/**
	 * Number of assault parties <p>
	 * Given by: (NUM_THIEVES - 1) / ASSAULT_PARTY_SIZE <br>
	 * */
	public static final int NUM_ASSAULT_PARTIES = (NUM_THIEVES - 1) / ASSAULT_PARTY_SIZE;
	
	/**
	 * Number of exhibition rooms having paintings in display <br>
	 * */
	public static final int NUM_ROOMS_WITH_PAINTINGS = 5;
	
	/**
	 * Maximum separation limit between ordinary thieves crawling <br>
	 * */
	public static final int MAX_SEPARATION_DISTANCE = 3;
	
	/**
	 * Minimum displacement of an ordinary thief <br>
	 * */
	public static final int MIN_DISPLACEMENT = 2;
	
	/**
	 * Maximum displacement of an ordinary thief <br>
	 * */
	public static final int MAX_DISPLACEMENT = 6;
	
	/**
	 * Minimum distance of an exhibition room to the outside concentration site <br>
	 * */
	public static final int MIN_DISTANCE_TO_SITE = 15;
	
	/**
	 * Maximum distance of an exhibition room to the outside concentration site <br>
	 * */
	public static final int MAX_DISTANCE_TO_SITE = 30;
	
	/**
	 * Minimum number of paintings hanging in an exhibition room <br>
	 * */
	public static final int MIN_PAINTINGS_IN_ROOM = 8;
	
	/**
	 * Maximum number of paintings hanging in an exhibition room <br>
	 * */
	public static final int MAX_PAINTINGS_IN_ROOM = 16;
	
	/**
	 * Private constructor to prevent class from being instantiated <br>
	 * @throws UnsupportedOperationException
	 */
	private Constants(){
        throw new UnsupportedOperationException("Instantiation of Constants class is not permitted!");
    }
}
