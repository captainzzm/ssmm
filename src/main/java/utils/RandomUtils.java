package utils;

import java.util.Random;

/**
 *@Title RandomUtils.java
 *@package utils
 *@author zzm
 *@Description TODO
 *@time 创建时间 2017-1-10下午10:04:34
 *@version V1.0
 *类说明
 */

public class RandomUtils {
	
	private RandomUtils(){
		
	}
	
	/**随机验证码0~9
	 * @param charCount
	 * @return
	 */
	public static String getRandNum(int charCount){
		 String charValue = "";
	        for (int i = 0; i < charCount; i++) {
	            char c = (char) (randomInt(0, 10) + '0');
	            charValue += String.valueOf(c);
	        }
	        return charValue.trim();
	}
	
	public static int randomInt(int from, int to) {
        Random r = new Random();
        return from + r.nextInt(to - from);
    }
	
	
	
	
	

}

