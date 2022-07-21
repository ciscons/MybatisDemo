package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CityDao;
import com.example.vo.CityVo;

@Service("cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;
	
	@Override
	public CityVo selectCity(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CityVo> selectAllCitiesByCountryCode(String countryCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
