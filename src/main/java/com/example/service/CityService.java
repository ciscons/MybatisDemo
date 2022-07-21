package com.example.service;

import java.util.List;

import com.example.vo.CityVo;

public interface CityService {
	CityVo selectCity(String name);
	List<CityVo> selectAllCitiesByCountryCode(String countryCode);
	
}
