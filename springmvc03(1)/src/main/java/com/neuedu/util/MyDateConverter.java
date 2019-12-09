package com.neuedu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String, Date> {

	//将字符串转换成java.util.Date类型
	@Override
	public Date convert(String arg0) {
		Date d1 = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			d1 = sdf.parse(arg0);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d1;
	}

}
