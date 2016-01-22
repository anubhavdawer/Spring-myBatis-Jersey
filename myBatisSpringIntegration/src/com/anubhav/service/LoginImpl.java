package com.anubhav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.anubhav.domain.Login;
import com.anubhav.mappers.LoginMapper;

/**
 * This class is at the service level and acts as a service layer in the MVC application
 * "@service" component in spring tells us that this can be auto scanned as a component.
 * It is a specialization of the component annotation.
 * @author adawer
 *
 */
@Service
public class LoginImpl {

	//Injecting loginMapper in this bean using @Autowired annotation
	@Autowired
	LoginMapper loginMapper;
	
	/**
	 * This method handles the transactions in the database.
	 * It accepts a mapper and then takes care of calling the methods defined in mapper
	 * "@Transaction" tells Spring to look for any bean declared in the context with the name transactionmanager
	 * to handle the transactions defined
	 * @param userId
	 * @return
	 */
	@Transactional
	public Login selectLogin(String userId) {
		Login login;
		login= loginMapper.selectLogin(userId);
		return login;
	}

}
