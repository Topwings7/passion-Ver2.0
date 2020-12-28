package com.tj.top.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tj.top.dto.Master;

@Repository
public class MasterDaoImpl implements MasterDao{
	@Autowired
	private SqlSession sessionTemplate;

	@Override
	public int mloginchk(Master master) {
		return sessionTemplate.selectOne("mloginchk", master);
	}

	@Override
	public Master mloginid(Master master) {
		return sessionTemplate.selectOne("mloginid", master);
	}
	
	
}
