package Dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.User;

public class UserDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sangram");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void SaveAndUpdateUser(User User) 
	{
		et.begin();
		em.merge(User);
		et.commit();
	}
	public User FetchUserById() {
		
		return null;
			
		}
	
	public User fetchUserByEmailAndPassword(String email,String password)
	{
		Query query = em.createQuery("select u from User u where email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List <User>list = query.getResultList();
		
		if (list.isEmpty()) {
		return null;}
		else { 
			for (User user : list) {
				return user;
				
			}
			return null;
		}
	}
	public User FetchAllUsers() {
		return null;
		
	}
	
	}
	

