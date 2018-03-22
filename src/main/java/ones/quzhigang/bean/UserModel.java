package ones.quzhigang.bean;

import java.io.Serializable;

public class UserModel implements Serializable{
	
	 
	 	 	private Long userId;
	 	 	private String userName;
	 	 	private String password;
	 	 	private Integer credits;
	 	 	private String lastVisit;
	 	 	private String lastIp;
	 
			public void setUserId(Long userId){
			this.userId=userId;
		}
	
	
	    public Long getUserId(){
          return userId;
	    }
	
	
			public void setUserName(String userName){
			this.userName=userName;
		}
	
	
	    public String getUserName(){
          return userName;
	    }
	
	
			public void setPassword(String password){
			this.password=password;
		}
	
	
	    public String getPassword(){
          return password;
	    }
	
	
			public void setCredits(Integer credits){
			this.credits=credits;
		}
	
	
	    public Integer getCredits(){
          return credits;
	    }
	
	
			public void setLastVisit(String lastVisit){
			this.lastVisit=lastVisit;
		}
	
	
	    public String getLastVisit(){
          return lastVisit;
	    }
	
	
			public void setLastIp(String lastIp){
			this.lastIp=lastIp;
		}
	
	
	    public String getLastIp(){
          return lastIp;
	    }
	
	
	
		
}