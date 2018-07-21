package utils;
/**
 *@Title ChineseEra.java
 *@package utils
 *@author zzm
 *@Description TODO
 *@time 创建时间 2017-1-20下午10:52:41
 *@version V1.0
 *类说明
 */

/**天干地支纪年法
 * @author zzm
 *
 */
public class ChineseEraUtils {
	
	public static final String[] TG =  new String[]{"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"};
	public static final String[] DZ = new String[]{"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};

	//用10个天干和12个地支，依次两两相配，就可得出60个不相同的天干地支组合，简称60干支，又称为60花甲子。
	//公元4年为甲子年
	private ChineseEraUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/**解析年
	 * @param year(>0)
	 * @return
	 */
	public static String parse(int year){
		if(year>0){
			int num  = year%60;
			int ti =0;
			int di =0;
			if(num>=4){
				ti= (num-3-1)%10;
				di = (num-3-1)%12;
			}else{
				ti= (num+60-3-1)%10;
				di = (num+60-3-1)%12;
			}
			String ret =TG[ti]+DZ[di];
			 
			return ret;
		}else{
			return "";
		}
	}
	
	

}

