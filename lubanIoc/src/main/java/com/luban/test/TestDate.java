package com.luban.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		String dateString="1019.01.01";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(formatter.parse(dateString));
	}
}
