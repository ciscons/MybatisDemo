package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.CityVo;

@Repository("cityDao")
public class CityDaoImpl implements CityDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public CityVo read(String name) {
		return this.sqlSession.selectOne("City.selectCity", name);
	}

	@Override
	public List<CityVo> readAll(String countryCode) {
		return this.sqlSession.selectList("City.selectCitiesByCountryCode", countryCode);
	}

}
