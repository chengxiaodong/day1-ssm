package com.njit.dianyi.service;


import com.njit.dianyi.pojo.TbUser;
import com.njit.dianyi.utils.exception.LoginMissingArgumentsException;


public interface UserService {
	
	public TbUser login(String username,String password)throws LoginMissingArgumentsException ;
}
