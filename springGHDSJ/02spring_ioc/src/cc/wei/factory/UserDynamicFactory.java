package cc.wei.factory;

import cc.wei.vo.User;

/*
 * ͨ����̬������������
 * @author weiliangchun
 */
public class UserDynamicFactory {
	public User createUser (int age,String name) {
		return new User(age,name);
	}
}
