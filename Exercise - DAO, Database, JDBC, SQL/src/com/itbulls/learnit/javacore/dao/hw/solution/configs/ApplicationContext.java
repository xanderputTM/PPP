package com.itbulls.learnit.javacore.dao.hw.solution.configs;

import com.itbulls.learnit.javacore.dao.hw.solution.entities.Cart;
import com.itbulls.learnit.javacore.dao.hw.solution.entities.User;
import com.itbulls.learnit.javacore.dao.hw.solution.entities.impl.DefaultCart;
import com.itbulls.learnit.javacore.dao.hw.solution.menu.Menu;

public class ApplicationContext {
	
	private static ApplicationContext instance;
	
	private User loggedInUser;
	private Menu mainMenu;
	private Cart sessionCart;
	
	private ApplicationContext() {
	}
	
	public void setLoggedInUser(User user) {
		if (this.sessionCart != null) {
			this.sessionCart.clear(); // we have to clear session cart when new user is logged in
		}
		this.loggedInUser = user;
	}
	
	public User getLoggedInUser() {
		return this.loggedInUser;
	}
	
	public void setMainMenu(Menu menu) {
		this.mainMenu = menu;
	}
	
	public Menu getMainMenu() {
		return this.mainMenu;
	}

	public static ApplicationContext getInstance() {
		if (instance == null) {
			instance = new ApplicationContext();
		}
		return instance;
	}

	public Cart getSessionCart() {
		if (this.sessionCart == null) {
			this.sessionCart = new DefaultCart();
		}
		return this.sessionCart;
	}

}
