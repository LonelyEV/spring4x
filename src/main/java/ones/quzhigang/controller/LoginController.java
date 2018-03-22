/**
 * Project Name:spring4x
 * File Name:LoginController.java
 * Package Name:ones.quzhigang.controller
 * Date:2018年3月21日下午5:39:22
 *
*/

package ones.quzhigang.controller;

import ones.quzhigang.bean.UserModel;
import ones.quzhigang.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:LoginController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年3月21日 下午5:39:22 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/test",method={RequestMethod.GET})
	public String test(){
		UserModel userModel =  userService.getByUserId(1);
		return userModel.toString();
	}
	

}

