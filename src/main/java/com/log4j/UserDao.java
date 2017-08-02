package com.log4j;

import org.apache.log4j.Logger;

public class UserDao {
	private static final Logger logger = Logger.getLogger(UserDao.class);

	public static void main(String[] args) {
		logger.debug("****************debug");
	}
}
