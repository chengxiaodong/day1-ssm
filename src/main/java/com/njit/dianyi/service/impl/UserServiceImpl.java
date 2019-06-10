package com.njit.dianyi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.util.StringUtil;
import com.njit.dianyi.mapper.TbUserMapper;
import com.njit.dianyi.pojo.TbUser;
import com.njit.dianyi.pojo.TbUserExample;
import com.njit.dianyi.pojo.TbUserExample.Criteria;
import com.njit.dianyi.service.UserService;

import com.njit.dianyi.utils.exception.LoginMissingArgumentsException;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private TbUserMapper tbUserMapper;
	@Override
	public TbUser login(String username,String password) throws LoginMissingArgumentsException{
		if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)) {
			throw new  LoginMissingArgumentsException("登录失败，用户名或密码为空！");
		}
		
		TbUserExample example=new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<TbUser> users = tbUserMapper.selectByExample(example);
		return users.size()==0?null:users.get(0);   //需要优化
	}

}
