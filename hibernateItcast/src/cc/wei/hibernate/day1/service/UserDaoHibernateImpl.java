package cc.wei.hibernate.day1.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import cc.wei.hibernate.day1.domain.User;
import cc.wei.hibernate.day1.util.HibernateUtil;

public class UserDaoHibernateImpl implements IUserDao {

	@Override
	public void save(User u) {
		//�ӻỰ������õ��Ự
		Session session = HibernateUtil.getSession();
		//����һ������
		Transaction tx = session.beginTransaction();
		//�������
		session.save(u);
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
	}

	@Override
	public void delete(Long id) {
	
		//�ӻỰ������õ��Ự
		Session session = HibernateUtil.getSession();
		//����һ������
		Transaction tx = session.beginTransaction();
		//ɾ������
		User u = new User();
		u.setId(id);
		session.delete(u);
		//�ύ����
		tx.commit();
		//�رջỰ
		session.close();
	}

	@Override
	public void update(User u) {
		 Session session = HibernateUtil.getSession();
		 Transaction tx = session.beginTransaction();
		 //�޸Ķ���
		 session.update(u);
		 tx.commit();
		 session.close();
		
	}

	@Override
	public User get(Long id) {
		Session session = HibernateUtil.getSession();
		User u = (User)session.get(User.class,id);
		session.close();
		return u;
	}

	@Override
	public List<User> getAllUsers() {
		Session session = HibernateUtil.getSession();
		//������ѯ��
		Query q = session.createQuery("SELECT u FROM Uer u");
		//��ѯ���
		List<User> us = q.list();
		return us;
	}

	@Override
	public List<User> findUsersByNames(String name) {
		Session session = HibernateUtil.getSession();
		//������ѯ��
		Query q = session.createQuery("SELECT u FROM Uer u WHERE u.name=?");
		q.setString(0, "%"+name+"%");
		//��ѯ���
		List<User> us = q.list();
		return us;
	}

}
