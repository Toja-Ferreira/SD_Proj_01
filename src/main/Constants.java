package main;

/** 
 * 
 * @author 89078 - Luis Couto
 * @author 89082 - Antonio Ferreira
 * @brief File that contains the constant values used by the program
 */

public final class Constants {
	
	/**
	 * @brief Total number of existing thieves, including Master Thief
	 * */
	public static final int NUM_THIEVES = 7;
	
	/**
	 * @brief Number of ordinary thieves in each assault party
	 * */
	public static final int ASSAULT_PARTY_SIZE = 3;
	
	/**
	 * @brief Number of assault parties
	 * @value (NUM_THIEVES - 1) / ASSAULT_PARTY_SIZE
	 * */
	public static final int NUM_ASSAULT_PARTIES = (NUM_THIEVES - 1) / ASSAULT_PARTY_SIZE;
	
	/**
	 * @brief Number of exhibition rooms having paintings in display
	 * */
	public static final int TOTAL_EXHIBITION_ROOMS = 5;
	
	/**
	 * @brief Maximum separation limit between ordinary thieves crawling
	 * */
	public static final int MAX_SEPARATION_DISTANCE = 3;
	
	/**
	 * @brief Minimum displacement of the ordinary thieves
	 * */
	public static final int MIN_DISPLACEMENT = 2;
	
	/**
	 * @brief Maximum displacement of the ordinary thieves
	 * */
	public static final int MAX_DISPLACEMENT = 6;
	
	/**
	 * @brief Minimum distance to the outside concentration site
	 * */
	public static final int MIN_DISTANCE_TO_SITE = 15;
	
	/**
	 * @brief Maximum distance to the outside concentration site
	 * */
	public static final int MAX_DISTANCE_TO_SITE = 30;
	
	/**
	 * @brief Minimum number of paintings hanging in each room
	 * */
	public static final int MIN_PAINTINGS_IN_ROOM = 8;
	
	/**
	 * @brief Maximum number of paintings hanging in each room
	 * */
	public static final int MAX_PAINTINGS_IN_ROOM = 16;
}
