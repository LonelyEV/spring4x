/**
 * Project Name:spring4x
 * File Name:UserServiceTest.java
 * Package Name:ones.quzhigang.test
 * Date:2018年3月21日下午4:39:33
 *
*/

package ones.quzhigang.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;
import ones.quzhigang.bean.UserModel;
import ones.quzhigang.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName:UserServiceTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年3月21日 下午4:39:33 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testUserService(){
/*		UserModel userModel =  userService.getByUserId(1);
		Assert.assertNotNull(userModel);*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		
		UserModel userModel = new UserModel();
		userModel.setUserName("test001");
		userModel.setPassword("admin");
		userModel.setCredits(1);
		userModel.setLastVisit(sdf.format(new Date()));
		userModel.setLastIp("192.168.0.1");
		userService.insert(userModel);
	}

}

