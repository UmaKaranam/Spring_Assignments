module LibraryManagement {
	exports com.cg.library.exception;
	exports com.cg.library.pl;
	exports com.cg.library.test;
	exports com.cg.library.dto;
	exports com.cg.library.util;
	exports com.cg.library.service;
	exports com.cg.library.dao;
	exports com.cg.library.logger;

	requires java.sql;
	requires junit;
	requires log4j;
}