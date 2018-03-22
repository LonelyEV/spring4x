package ones.quzhigang.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import ones.quzhigang.bean.UserModel;
import ones.quzhigang.query.UserQuery;

public interface  UserMapper{
	

																																																																																																																				
	final String columns="user_id,user_name,password,credits,last_visit,last_ip";
	
	final String insert="user_id,user_name,password,credits,last_visit,last_ip";
																																																																																																												
	final String property="#{userId},#{userName},#{password},#{credits},#{lastVisit},#{lastIp}";
	
	final String insertProperty="#{userId},#{userName},#{password},#{credits},#{lastVisit},#{lastIp}";
																																																																																																																				
	final String update="user_name=#{userName},password=#{password},credits=#{credits},last_visit=#{lastVisit},last_ip=#{lastIp}";
	
	@Select("select "+columns+" from tbl_user where user_id=#{userId}")
	@ResultMap(value="ones.quzhigang.mapper.UserMapper.UserModelMap")
	public UserModel getByUserId(long userId);
	
	@Insert("insert into tbl_user ("+insert+") values ("+insertProperty+")")
	@SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="userId", before=false, resultType=Long.class)
	public long insert(UserModel user);

	@Update("update tbl_user set "+update+" where ID=#{id}")
	public long update(UserModel user); 
	
	@Delete("delete from tbl_user where 1 = 1 and ID=#{id} ")
	public void delById(long id);

	@SelectProvider(type=ones.quzhigang.provider.UserProvider.class,method="fetchPageAdvance")
	@ResultMap(value="ones.quzhigang.mapper.UserMapper.UserModelMap")
	public List<UserModel> fetchPageAdvance(UserQuery query);  
	
	
	@SelectProvider(type=ones.quzhigang.provider.UserProvider.class,method="fetchPageAdvanceCount")
	public int fetchPageAdvanceCount(UserQuery query);
	
	
	
	
}