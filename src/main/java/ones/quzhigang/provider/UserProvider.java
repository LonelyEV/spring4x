package ones.quzhigang.provider;

import java.io.Serializable;

import ones.quzhigang.query.UserQuery;


public class UserProvider implements Serializable  {

	
	
	
	public String fetchPageAdvance(UserQuery query){  
		StringBuffer sql=new StringBuffer("select * from tbl_user where 1 = 1" );
		   if(query!=null){

		   }
		
		

	
		sql.append(" order by ID desc " );
		
		if(query.getLimit()>0){
			sql.append(" limit "+(query.getPageNumber()-1)*query.getPageSize()+","+query.getPageSize());
		}


		
		
		return sql.toString();
	}
	
	public String fetchPageAdvanceCount(UserQuery query){
		StringBuffer sql=new StringBuffer("select count(*) from tbl_user where 1 = 1" );
		   if(query!=null){

		   }
		
		
		return sql.toString();
	}
	
	
	

}
