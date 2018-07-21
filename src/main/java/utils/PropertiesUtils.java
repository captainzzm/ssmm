package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

/**
 *@Title PropertiesUtils.java
 *@package utils
 *@author zzm
 *@Description TODO
 *@time 创建时间 2016-12-31下午2:17:16
 *@version V1.0
 *类说明  属性文件工具
 */

public class PropertiesUtils {
	
	
	
	
	private PropertiesUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param resource
	 * @return
	 * @throws IOException
	 */
	public Hashtable<String, String> getHashtable(String resource) throws IOException{
		Hashtable<String,String> hashtable = new Hashtable<String,String>();
		Properties p = new Properties();
		InputStream  is = PropertiesUtils.class.getClassLoader().getResourceAsStream(resource);
		p.load(is);
		
		Enumeration en = p.propertyNames();
		while(en.hasMoreElements()){
			String key = (String) en.nextElement();
			String value = p.getProperty(key);
			hashtable.put(key, value);
		}
		is.close();
		return hashtable;
	}
	
}

