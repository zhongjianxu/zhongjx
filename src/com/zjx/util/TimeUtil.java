package com.zjx.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeUtil {

	/***
	 * 获取当前时间（long格式）
	 * @return
	 */
	public long getCurrentTime() {
		return System.currentTimeMillis();
	}
	
	/***
	 * 获取当前时间yyyy-MM-dd HH:mm:ss格式
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
