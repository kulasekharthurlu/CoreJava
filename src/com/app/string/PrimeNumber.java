package com.app.string;

import java.util.stream.IntStream;

import org.apache.log4j.Logger;

public class PrimeNumber {
	private static final Logger log = Logger.getLogger(PrimeNumber.class);
	static int number = 25;
	static int num = number / 2;;

	public static boolean checkDevise(int prime) {
		log.info(prime);
		return  prime % num == 0;
	}

	public static void main(String[] args) {
		boolean result = true;
		int count = 0;
		for(int i=2;i<num/2;i++) {
		if(num%i==0) {
		result=false;
		break;
		}
		}
		if(result)
			log.info("this is prime number");
		else 
			log.info("not prime number");
		
		log.info(count);

		if (IntStream.range(2, num).noneMatch(e -> num % 2 == 0))
			log.info(number + " prime");
		else
			log.info(number + "  not prime");
	}

}
