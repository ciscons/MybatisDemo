package com.example;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Log
class CityTest {
	@Autowired
	private DataSource dataSource;
	
	@Test
	void test() {
//		assertNotNull(this.dataSource);
		try {
			Connection conn = this.dataSource.getConnection();
			log.info(conn.toString());
		} catch (Exception e) {
			log.warning(e.getMessage());
		}
//		log.info("Hello World!");
	}

}
