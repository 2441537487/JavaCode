package cc.wei.hibernate.day1.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
	private static SessionFactory sf;
	public HibernateUtil() {}
	
	static {
		//����hibernate����hibernate��������
		//����hibernate�����ö���
		Configuration conf = new Configuration();
		conf.configure();
		//����һ��SessionFactory,�Ự����
		sf = conf.buildSessionFactory();
		
	}
	public static SessionFactory getSF() {
		return sf;
	}
	public static Session getSession() {
		return sf.openSession();
	}
	
}
