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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CityVo> readAll(String countyCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
