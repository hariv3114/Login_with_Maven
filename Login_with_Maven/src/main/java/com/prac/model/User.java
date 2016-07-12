
package com.prac.model;

/**
 * Created by Harigarakumar_Velayudam
 * on Jul 11, 2016
 * @version 1.0
 * @since Jul 11, 2016
 */

public class User {
	
	private String email;
	private String password;
	
	/**
	 * 
	 */
	public User(String email, String password) {
		this.email = email;
		this.password = password;
		
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
