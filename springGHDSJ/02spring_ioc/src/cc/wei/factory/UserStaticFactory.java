package cc.wei.factory;
/*
 * ����User ��̬����
 * @author weiliangchun
 */

import cc.wei.vo.User;

public class UserStaticFactory {
	public static User createUser(int age,String name) {
		return new User(age,name);
	}
}	
