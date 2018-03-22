package ones.quzhigang.service.impl;


import java.util.List;

import ones.quzhigang.bean.UserModel;
import ones.quzhigang.mapper.UserMapper;
import ones.quzhigang.query.UserQuery;
import ones.quzhigang.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	
	//根据ID查询指定的数据
	public UserModel getByUserId(long userId){ 
		return userMapper.getByUserId(userId);
	}
	
	//删除 
	public void delById(long id){
	    		userMapper.delById(id);
	}
	
	//新增
	public long insert(UserModel user){	
	    		return userMapper.insert(user);
		
	}
	
	//修改
	public long update(UserModel user){
	    		return userMapper.update(user);
	}
	
	//高级查询 
	@Override
	public List<UserModel> fetchPageAdvance(UserQuery query) {
	    		return userMapper.fetchPageAdvance(query);
	}
	
	//高级查询总记录数
	@Override
	public int fetchPageAdvanceCount(UserQuery query) {
	    		return userMapper.fetchPageAdvanceCount(query);
	}

	
	

}
