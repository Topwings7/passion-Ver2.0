package com.tj.top.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tj.top.dao.MasterDao;
import com.tj.top.dto.Master;

@Service
public class MasterServiceImple implements MasterService{
	@Autowired
	private MasterDao masterDao;

	@Override
	public int mloginchk(Master master) {
		return masterDao.mloginchk(master);
	}

	@Override
	public Master mloginid(Master master) {
		return masterDao.mloginid(master);
	}


}
