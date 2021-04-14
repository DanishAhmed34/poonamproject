package com.poonam.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.poonam.dto.CustomerDto;

public class CustomerModel {

	public static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}

	public void add(CustomerDto dto) {

		Session session = getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}

		}

	}

}