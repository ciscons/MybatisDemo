package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.service.CityService;
import com.example.vo.CityVo;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Log
class CityTest {

	@Autowired	
	private CityService cityService;
	
	@Test
	public void test() {
		assertNotNull(this.cityService);
	}
	
	@Test
	public void test1() {
		CityVo city = this.cityService.selectCity("Seoul");
		log.info(city.toString());
	}
	
	@Test
	public void test2() {
		for(CityVo city : this.cityService.selectAllCitiesByCountryCode("KOR")) {
			log.info(city.toString());
		}
	}

}
