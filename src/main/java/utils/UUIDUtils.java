package utils;

import java.util.UUID;

/**
 *@Title UUIDUtils.java
 *@package utils
 *@author zzm
 *@Description TODO
 *@time 创建时间 2017-1-10下午11:03:06
 *@version V1.0
 *类说明
 */

public class UUIDUtils {
	private UUIDUtils() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
	

}

