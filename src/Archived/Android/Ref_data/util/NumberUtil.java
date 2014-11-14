package com.vianet.bento.util;

public class NumberUtil {

	/** 
	 * Method to generate random number
	 * @param range Maximum value of the random number to be generated
	 * @return Generated random number in the range specified
	 */
	public static Double random(long range){
		Double x = Math.floor(Math.random() * Math.pow(10,(range+"").length())) % range;
		return x;
	}
	
}
