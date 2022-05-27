package com.brower.gittalk.User;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * 
 * Describes and holds the attributes of any given user
 * Things that will need to be held:
 * 		Username
 * 		userid
 * 
 * @author jacobbrower
 *
 */
public class User implements Serializable {

	private String userId;
	private String username;
	
	public User() {} //Blank constroctor to help with testing
	
	public User(String username) {
		this.username = username;
		this.userId = UUID.randomUUID().toString();
	}
	
	public String getUsername() { return this.username; }
	
	public void setUsername(String username) { this.username = username; }
	
	public String getUserId() { return this.userId; }
	
	public void setUserId(String userId) { this.userId = userId; }
	
	@Override
	public int hashCode() {
		return Objects.hash(userId, username);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) { 
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		User other = (User) obj;
		
		return Objects.equals(this.userId, other.userId) && Objects.equals(this.username, other.username);
	}
}
















