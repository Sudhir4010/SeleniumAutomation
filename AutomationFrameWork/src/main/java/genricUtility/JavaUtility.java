package genricUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used to capture current system date and time
	 * @return String
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	
	/**
	 * this method is used to generate random numbers within in 1000
	 * @return int
	 */
	
	public int GetRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}

}
