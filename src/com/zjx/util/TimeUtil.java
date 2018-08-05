package com.zjx.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeUtil {

	/***
	 * ��ȡ��ǰʱ�䣨long��ʽ��
	 * @return
	 */
	public long getCurrentTime() {
		return System.currentTimeMillis();
	}
	
	/***
	 * ��ȡ��ǰʱ�䣨yyyy-MM-dd HH:mm:ss��ʽ��
	 * @return
	 */
	public String getFormatTime() {
		Date date=new Date();
		String format="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	public static void main(String[] args) {
		TimeUtil util=new TimeUtil();
		System.out.println(util.getFormatTime());
		
	}
	
}
